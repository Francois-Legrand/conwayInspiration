package fr.francois.conway;

import java.util.ArrayList;
import java.util.Arrays;

public class Conway {
	
	public static void main(String[] args) {
		conway();
		
	}
	public static void conway() {
		int[] sequence = {1,2,3,4,5,6};
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int value : sequence) {
			for(int j = 0; j < value-1; j++)
				
			arrayList.add(value);
			
		}
		System.out.println(arrayList);
	}
	
}
