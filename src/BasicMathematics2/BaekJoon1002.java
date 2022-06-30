package BasicMathematics2;

import java.util.Scanner;

//�ͷ�
public class BaekJoon1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCase;
		int result = 0;
		int[] arr = new int[6];
		
		int r1 , r2; 
		
		Scanner sc = new Scanner(System.in);
	
		testCase = sc.nextInt(); 				//arr[0] x1 ,y1,r1, x2, y2 ,r2
														
		for(int i =0; i<testCase; i++) {
			
			for(int j=0; j<6;j++) {          	 //���Ѵ�, 2��, 1��, 0���ϰ��(3�������).
				arr[j]=sc.nextInt();
			}
			
			if(arr[2]==arr[4]) { // �������� ���̰� ������
				r1 = arr[2];
				r2 = arr[5];
			}else {                  //r1�� ū���� ������, r2�� ���� ���� ������
				r1 = Math.max(arr[2],arr[5]);
				r2 = Math.min(arr[2],arr[5]);
				
			}
			
			if(r1==r2&&arr[0]==arr[3]&&arr[1]==arr[4]) {    //���� ��ǥ�� �������� ��ġ�Ҷ�.
				result = -1;
			}else if((r1-r2)*(r1-r2)<distance(arr[0],arr[3],arr[1],arr[4])&&distance(arr[0],arr[3],arr[1],arr[4])<(r1+r2)*(r1+r2)) {  //�� ������ ���� ���� ��
				result = 2;
			}else if((r1-r2)*(r1-r2)==distance(arr[0],arr[3],arr[1],arr[4])||distance(arr[0],arr[3],arr[1],arr[4])==(r1+r2)*(r1+r2)) {  //�� ������ ���� ���Ҷ�(����,����)
				result = 1;
			}else {
				result = 0;   //�� �ܿ� ������ ���� ��.
			}
			
			

			System.out.println(result);
		}
		
		
		
		
	}
	static int distance(int x1, int x2, int y1, int y2){
		
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
	}
	

}
