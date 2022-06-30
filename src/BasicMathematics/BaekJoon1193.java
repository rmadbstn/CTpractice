//  <<분수 찾기>> 백준 1193번


package BasicMathematics;

import java.util.Scanner;

public class BaekJoon1193 {
	

	
	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int count=1;                                 // 라인 위치 
        
        int mo,so; //분모 분자
        
        while(true){                                 // num번째 분수는 몇번째 라인에 존재하는지
            if(num<=count){							 // 1, 2, 3,순으로 num에서 빼서  num번째 분수가 존재하는 라인을 찾는다
                break;
            }
            num-=count;
            count++;
        }
       
        
        so = count - num+1;      // 븐자엔 라인에서 num을 빼고 +1을 한 수가 들어간다.
 //                                                                        )) ==>라인이 짝수이면 반대로 된다.  
        mo = num;				//분모엔 남아있는 num만큼 수가 들어간다.
        if(count%2==0){                              // 라인 위치가 짝수라면 
        	mo = count - num+1;
        	so  = num;                 // 분모 분자를 뒤집는다.
        }
                                    
        System.out.println(so+"/"+mo);

        
    }


}
