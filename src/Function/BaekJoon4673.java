package Function;

public class BaekJoon4673 {

	static boolean[] arr;

	public static void selfNumber(int n) {

		if (arr[n] == true) {
			return;
		}

		if (n >= 1000) {
			n = n + n % 10 + n / 1000 + (n - (n / 1000) * 1000) / 100
					+ (n - ((n / 1000) * 1000) - (n - (n / 1000) * 1000) / 100 * 100)/10;

		} else if (n >= 100) {
			n = n + n % 10 + n/100 + (n-n/100*100)/10;

		} else if (n >= 10) {
			n = n + n / 10 + n % 10;

		} else {
			n = n + n;
		}

		if (n > 10000) {
			return;
		}
		selfNumber(n);
		arr[n] = true;
	}

	public static void main(String[] args) {

		arr = new boolean[10001];
		int i = 1;
		int j = 1;
		while (i < 10000) {

			selfNumber(i);

			i++;
		}

		while (j < 10001) {

			if (arr[j] == false) {
				System.out.println(j);
			}
			j++;
		}

	}

}
