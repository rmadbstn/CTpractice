package Programmerslv2;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brown = 24;
		int yellow = 24;

		for (int i = 1; i <=Math.sqrt(yellow); i++) {// 가로

			for (int j = 1; j <= i; j++) {

				if (i * j == yellow) {

					if ((i + 2) * (j + 2) - yellow == brown) {

						System.out.println((i+2)+" "+(j+2));
						return;
					}

				}

			}

		}

	}

}
