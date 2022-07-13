package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(average(arr));
		System.out.println(center(arr));
		System.out.println(most(arr));
		System.out.println(gap(arr));

	}

	static int average(int[] arr) {

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return (int) Math.round(sum / arr.length);
	}

	static int center(int[] arr) {
		Arrays.sort(arr);
		return arr[(arr.length) / 2];

	}

	static int most(int[] arr) {
		ArrayList<Integer> maxMembers = new ArrayList<>();
		Arrays.sort(arr);
		int checkNum = 4001;
		int max = 0;
		int count = 0;
		for (int num : arr) {
			if (num == checkNum) {
				count++;
			} else {
				count = 1;
			}
			checkNum = num;
			if (count == max) {
				maxMembers.add(checkNum);
			} else if (count > max) {
				maxMembers.clear();
				maxMembers.add(checkNum);
				max = count;
			}
		}
		if (maxMembers.size() >= 2) {
			return maxMembers.get(1);
		} else {
			return maxMembers.get(0);
		}

	}

	static int gap(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1] - arr[0];
	}

}
