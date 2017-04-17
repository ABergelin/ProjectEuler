package problem1;

import java.util.ArrayList;

public class problem1 {

	public static void main(String[] args) {
		// Working out the sum multiples of 3 or 5 below 1000
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int total = 0;
		
		for (int i = 1; i < 1000; i++){
			if ((i%3 == 0) || (i%5 == 0)){
				list.add(i);
				total = total + i;
			}
		}
		
		System.out.println("Total = " + total);
		

	}

}
