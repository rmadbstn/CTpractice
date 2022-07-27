package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon2477 {
	// 도형문제 나오면 좌표로 생각해도 좋다!.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int charmwai = Integer.parseInt(br.readLine());
		int[][] arr = new int[6][2];
		arr[0][0] = 0;
		arr[0][1] = 0; // 출발 xy좌표 미리저장 .
		
		int largeWidth = 0;  //큰사각형 가로,세로.
		int largeLength = 0;
		
		
		for (int i = 1; i < 7; i++) {

			String[] str = br.readLine().split(" ");
			
			if(i==6)
				continue;
			
			int direction = Integer.parseInt(str[0]); // 1. 동쪽(x++) , 2.서쪽(x--), 3.남쪽(y--), 4.북쪽(y++)

			int distance = Integer.parseInt(str[1]);

			

			switch (direction) {

			case 1:
				arr[i][0] = arr[i - 1][0] + distance; // x좌표 거리만큼 증가
				arr[i][1] = arr[i - 1][1];

				break;
			case 2:
				arr[i][0] = arr[i - 1][0] - distance; // x좌표 거리만큼 감소
				arr[i][1] = arr[i - 1][1];
				break;

			case 3:
				arr[i][1] = arr[i - 1][1] - distance; // y좌표 거리만큼 감소
				arr[i][0] = arr[i - 1][0];
				break;
			case 4:
				arr[i][1] = arr[i - 1][1] + distance; // y좌표 거리만큼 증가
				arr[i][0] = arr[i - 1][0];
				break;

			}
		}
		
		
		
			//x값 기준으로 정렬. 
//			Arrays.sort(arr);
		Arrays.sort(arr,new Comparator<int[]>(){
			
			@Override
			public int compare(int[] a,int[] b) {
				return Integer.compare(a[0],b[0]);
				
			}
			
		});
				
			int width = Math.max(arr[2][1], arr[3][1]) - Math.min(arr[2][1], arr[3][1]); //x값으로 정렬해놓고 중앙 좌표 두개의 y좌표 차이가 가로 또는 세로가된다.
																							//y 값으로 정렬했을때는 x값이 그렇게된다.
				largeWidth = arr[5][0]-arr[0][0];
			
			//y값 기준으로 정렬.
			Arrays.sort(arr,new Comparator<int[]>(){
				
				@Override
				public int compare(int[] a,int[] b) {
					return Integer.compare(a[1],b[1]);
					
				}
				
			});
			 int length = Math.max(arr[2][0], arr[3][0]) - Math.min(arr[2][0], arr[3][0]);
			largeLength = arr[5][1] - arr[0][1];
			

			int area = (largeWidth*largeLength)-(width*length);
//			System.out.println("large Width: "+largeWidth+" largeLength: "+largeLength+ " width: "+width+" length: "+length);
			System.out.println(area*charmwai);
	}

}
