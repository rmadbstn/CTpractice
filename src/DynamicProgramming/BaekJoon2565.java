package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon2565 {

	static int[] arr;
	static int[] dpArr;

	public static void main(String[] args) {				//전체 줄의 개수-겹치지 않는 줄의 개수 =빼야하는 줄의개수.

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int index;
		int maxIndex=0;
		int realMax = 1;

		
		arr = new int[502];										//dpArr = 이전 층까지를 비교하여 겹치지않고 최대로 그을수 있는 선의 값을 저장.
		dpArr = new int[502];

		for (int i = 0; i < N; i++) {
			index = sc.nextInt();

			arr[index] = sc.nextInt();
			if(index>maxIndex) {
				maxIndex = index;
			}

		}
		
		dpArr[1]=1;

		for (int i = 2; i <= maxIndex; i++) {
			int max = 1;
			if (arr[i] != 0) {
				for (int j = 1; j < i; j++) {

					if (arr[j] < arr[i] && arr[j] != 0) {

						if (max < dpArr[j]+1) {
							max = dpArr[j]+1 ;
						}
					}
					
				}
				dpArr[i]=max;
//				System.out.println(i+"번:"+dpArr[i]);
			}
			if (max > realMax) {
				realMax = max;
			}
		}
		System.out.println(N - realMax);
	}

}
