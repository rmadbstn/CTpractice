package Programmerslv2;

import java.util.Arrays;

public class LifeBoat {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] people = {70,80,50};
		
		int limit = 100;
		
		int answer = people.length;
		
		Arrays.sort(people); //{50,50,70,80}
		
		int endPoint = people.length-1;
		
		for(int i=0;i<people.length;i++) {
			
			
			int count = 1;
			int sum = people[i];
			
			
		
			for(int j=endPoint;j>i;j--) {
				
				
				if(people[i]+people[j]<=limit) {
					answer--;
					i++;
					endPoint = j-1;
				}
				
				
				
			}
			
			
			
		}
		
		
		System.out.println(answer);

	}

}
