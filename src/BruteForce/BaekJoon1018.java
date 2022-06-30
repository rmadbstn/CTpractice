package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String text = br.readLine();
		String[] word = text.split(" ");
		int column = Integer.parseInt(word[0]); // 세로
		int row = Integer.parseInt(word[1]); // 가로
		int check1Num = 0, check2Num = 0;
		int paintNum=0;
		int min=2500;
		char[][] check1 = {
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'}
				 };
		char[][] check2 = {
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'},
				 {'W','B','W','B','W','B','W','B'},
				 {'B','W','B','W','B','W','B','W'}
				 };
		char[][] chess = new char[column][row];

		
		
		
		for (int i = 0; i < column; i++) {

			String text2 = br.readLine();

			for (int j = 0; j < row; j++) {

				chess[i][j] = text2.charAt(j); // Black or White 채워넣기.
			}

		}

		for (int i = 0; i < column - 7; i++) {

			for (int j = 0; j < row - 7; j++) {

				for (int y = i; y < i + 8; y++) {
					for (int x = j; x < j + 8  ; x++) {
						if(chess[y][x]!=check1[y-i][x-j]) {
							check1Num++;
						}                                        //동시에 두가지경우 비교하기 위해 동시에 카운팅.
						if(chess[y][x]!=check2[y-i][x-j]) {
							check2Num++;
						}
						
						
					}
				}
				paintNum=Math.min(check1Num, check2Num);
				if(min>paintNum) {
					min =paintNum;
				}
				check1Num=0;
				check2Num=0;
			}

		}
		
		bw.write(min+" ");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
