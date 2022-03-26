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
					sb.append(1); // �ռ� ����� ���� ���� 10�� ������� �� ���ڸ��� 1�� �߰����ش�.
				}
				break;
			} else if (a.length() - i < 0) {
				if (x + y >= 10) { // ���� ����Ŭ���� ��갪�� 10�� �Ѿ��� �� ó��.

					y = b.charAt(b.length() - i) - 48 + 1;

					if (y == 10) {             //1�� ���� ���� ���޾� 10�� �Ǿ��� �� ó��
						sb.append(0);
					} else {
						sb.append(y);
					}

					;// b�� ���ڸ� �������� �״�� b�� ���� �־���. (48�� charAt�� �ؼ� �޾ƿ� ���ڴ� �ƽ�Ű�ڵ� ���̱⿡ -48�� ����)
				} else {
					sb.append(b.charAt(b.length() - i) - 48);
				}
				x = 0; // x���� 0���� �ؾ� ���� ����Ŭ���� ����������
			} else if (b.length() - i < 0) {
				if (x + y >= 10) {
					x = a.charAt(a.length() - i) - 48 + 1;

					if (x == 10) { 
						sb.append(0);   
					} else {
						sb.append(x);
					}
				} else {

					sb.append(a.charAt(a.length() - i) - 48); // a�� ���ڸ� �������� �״�� a�� ���� �־���.
				}
				y = 0; // y���� 0���� �ؾ� ���� ����Ŭ���� ����������
			} else if (x + y >= 10) {
				x = a.charAt(a.length() - i) - 48;
				y = b.charAt(b.length() - i) - 48; // ���� ����Ŭ���� ����� x+y�� 10���� Ŭ ��� ���� x+y�� ���� 1�� �����ܰ� ���ÿ� 10���� ���� ������ ����
													// StringBuilder�� �߰�����.
				sb.append((x + y + 1) % 10);

			} else {

				x = a.charAt(a.length() - i) - 48; // ���� ����Ŭ�� x+y�� 10������ ��� �ƹ�ó������ x,y�� ���� �����ϰ� ���� ���� StringBuilder��
													// �־���.
				y = b.charAt(b.length() - i) - 48;

				sb.append((x + y) % 10);
			}

			i++;

		}
		System.out.println(sb.reverse());

		// sb.append(a);

	}

}
