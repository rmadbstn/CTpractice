package Programmerslv2;

public class RepresentationOfNumbers {

	static int check;
	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 15;

		check = N;
		
		if(N==1) {
			System.out.println(1);
			return;
		}
		
		representation(1);
		System.out.println(count);
	}

	public static void representation(int a) {

		int k = a;
		int sum = 0;

		while (sum < check) {

			sum += k;

			k += 1;

		}

		if (sum == check) {
			System.out.println("시작수"+a);
			count++;
		}
		if (a + 1 <= check / 2) {
			representation(a + 1);
		}
	}

}
