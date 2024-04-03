package Programmerslv2;

public class JadenCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3people unFollowed me";
		
		String[] strArr = s.split(" ");
		
		String answer ="";
		for(String str:strArr) {
			answer+=jadenCase(str)+" ";
		}
		
		System.out.println(answer);
		
	}
	
	public static String jadenCase(String a) {
		
		String str = a.toLowerCase();
		String b =str.substring(0,1);
		String c = b.toUpperCase() + str.substring(1);
		
		
		
		
		
		
		
		
		return c;
		
	}

}
