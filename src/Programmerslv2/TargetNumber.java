package Programmerslv2;

public class TargetNumber {

	public static int count = 0;
	public static int check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		
		
		 int answer = 0;
	        
	        check = target;
	        dfs(0,0,numbers);
	        answer = count;
	            
	     System.out.println(answer);
		
		
		
	}

	public static  void dfs(int idx, int sum, int[] numbers) {

		int plusA = sum + numbers[idx];
		int minusA = sum - numbers[idx];

		if (idx == numbers.length - 1) {
			System.out.println(sum);
			if (plusA == check || minusA == check) {
				count++;
			}
			return;
		}

		dfs(idx + 1, plusA, numbers);

		dfs(idx + 1, minusA, numbers);

		return;
	}

}
