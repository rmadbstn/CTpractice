//  <<�м� ã��>> ���� 1193��


package BasicMathematics;

import java.util.Scanner;

public class BaekJoon1193 {
	

	
	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int count=1;                                 // ���� ��ġ 
        
        int mo,so; //�и� ����
        
        while(true){                                 // num��° �м��� ���° ���ο� �����ϴ���
            if(num<=count){							 // 1, 2, 3,������ num���� ����  num��° �м��� �����ϴ� ������ ã�´�
                break;
            }
            num-=count;
            count++;
        }
       
        
        so = count - num+1;      // ���ڿ� ���ο��� num�� ���� +1�� �� ���� ����.
 //                                                                        )) ==>������ ¦���̸� �ݴ�� �ȴ�.  
        mo = num;				//�и� �����ִ� num��ŭ ���� ����.
        if(count%2==0){                              // ���� ��ġ�� ¦����� 
        	mo = count - num+1;
        	so  = num;                 // �и� ���ڸ� �����´�.
        }
                                    
        System.out.println(so+"/"+mo);

        
    }


}
