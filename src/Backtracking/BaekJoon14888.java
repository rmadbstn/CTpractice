package Backtracking;

import java.util.Scanner;

public class BaekJoon14888 {

	static int N;
	static int[] operator = new int[4];
	static int[] numArr;
	static int Max;
	static int Min;

	public static void operating(int index, int[] operator, int result) {

		if (operator[0] == 0 && operator[1] == 0 && operator[2] == 0 && operator[3] == 0) {				//operator에 있는 산술 연산자가 다 떨어지면 result 확인후 리턴.
			if (result > Max) {
				Max = result;
			}

			if (result < Min) {
				Min = result;
			}

			return;
		}

		for (int i = 0; i < 4; i++) {

			if (operator[i] == 0) {
				continue;
			}

			switch (i) {

			case 0:															//한번씩 모든 산술연산자를 연산.
				operator[0] -= 1;
				operating(index+1, operator, result + numArr[index + 1]);
				operator[0] += 1;
				break;
			case 1:
				operator[1] -= 1 ;
				operating(index+1, operator, result - numArr[index + 1]);
				operator[1] += 1;
				break;
			case 2:
				operator[2] -= 1;
				operating(index+1, operator, result * numArr[index + 1]);
				operator[2] += 1;
				break;
			case 3:
				operator[3] -= 1;
				operating(index+1, operator, result / numArr[index + 1]);
				operator[3] += 1;
				break;

			}


		}

		return;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		numArr = new int[N];

		Max = -1000000001;
		Min = 1000000001;
		for (int i = 0; i < N; i++) {

			numArr[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {

			operator[i] = sc.nextInt();

		}

		operating(0, operator, numArr[0]);

		System.out.println(Max + "\n" + Min);
	}

}
