package Programmerslv2;

import java.util.HashMap;

public class Clothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = { { "crow_mask", "headgear" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "headgear" } };

		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i= 0; i<clothes.length;i++) {
			
			String clothePart = clothes[i][1];
			
			if(map.containsKey(clothePart)) {
				
				map.put(clothePart, map.get(clothePart)+1);
				
			}else {
				map.put(clothePart, 1);
			}
			
			
		}
		
		int answer = 1;
		
		for(int k:map.values()) {
			
			
			answer*=(k+1);
			
			
			
		}
		
		System.out.println(answer-1);

	}

}
