package Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections; // 내림차순 정렬을 위해 추

public class BaekJoon24445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);
        int R = Integer.parseInt(strArr[2]);

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] strArr2 = br.readLine().split(" ");
            int A = Integer.parseInt(strArr2[0]);
            int B = Integer.parseInt(strArr2[1]);

            adjList.get(A).add(B);
            adjList.get(B).add(A);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        int[] order = new int[N + 1];

        queue.add(R);
        visited[R] = true;
        order[R] = 1;

        int idx = 2;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 내림차순으로 정렬하여 방문
            List<Integer> neighbors = adjList.get(current);
            Collections.sort(neighbors, Collections.reverseOrder());
            for (int next : neighbors) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                    order[next] = idx++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (order[i] != 0) {
                System.out.println(order[i]);
            } else {
                System.out.println(0);
            }
        }
    }
}
