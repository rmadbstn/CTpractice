package BasicMathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10757 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String a = br.readLine();
		String b = br.readLine();

		int i = 1;

		int x = 0, y = 0;

		while (true) {

			if (a.length() - i < 0 && b.length() - i < 0) {
				if (x + y >= 10) {
					sb.append(1); // 앞서 계산한 값이 합이 10이 넘을경우 맨 앞자리에 1을 추가해준다.
				}
				break;
			} else if (a.length() - i < 0) {
				if (x + y >= 10) { // 이전 싸이클에서 계산값이 10이 넘었을 때 처리.

					y = b.charAt(b.length() - i) - 48 + 1;

					if (y == 10) {             //1을 더한 값이 연달아 10이 되었을 때 처리
						sb.append(0);
					} else {
						sb.append(y);
					}

					;// b에 숫자만 남았을때 그대로 b의 수를 넣어줌. (48은 charAt를 해서 받아온 숫자는 아스키코드 값이기에 -48을 해줌)
				} else {
					sb.append(b.charAt(b.length() - i) - 48);
				}
				x = 0; // x값을 0으로 해야 이후 싸이클에서 사용되지않음
			} else if (b.length() - i < 0) {
				if (x + y >= 10) {
					x = a.charAt(a.length() - i) - 48 + 1;

					if (x == 10) { 
						sb.append(0);   
					} else {
						sb.append(x);
					}
				} else {

					sb.append(a.charAt(a.length() - i) - 48); // a의 숫자만 남았을때 그대로 a의 수를 넣어줌.
				}
				y = 0; // y값을 0으로 해야 이후 싸이클에서 사용되지않음
			} else if (x + y >= 10) {
				x = a.charAt(a.length() - i) - 48;
				y = b.charAt(b.length() - i) - 48; // 이전 싸이클에서 계산한 x+y가 10보다 클 경우 현재 x+y의 값에 1을 더해줌과 동시에 10으로 나눈 나머지 값을
													// StringBuilder에 추가해줌.
				sb.append((x + y + 1) % 10);

			} else {

				x = a.charAt(a.length() - i) - 48; // 이전 싸이클에 x+y가 10이하인 경우 아무처리없이 x,y를 새로 정의하고 더한 값을 StringBuilder에
													// 넣어줌.
				y = b.charAt(b.length() - i) - 48;

				sb.append((x + y) % 10);
			}

			i++;

		}
		System.out.println(sb.reverse());

		// sb.append(a);

	}

}
