package problem2;

public class problem2 {

	public static void main(String[] args) {
		// Working out the sum of evens in fibonacci sequence to 4 million
		
		int fibTotal = 0;		//hold total
		int currentNum = 1;
		int lastNum = 1;
		int lastButOne = 0;
		
		while (currentNum < 4000000){
			
			currentNum = lastNum + lastButOne;
					
			
			if (currentNum%2 == 0){
				
				fibTotal = fibTotal + (currentNum);

			}
			
			lastButOne = lastNum;
			lastNum = currentNum;
			
			
		}
		
		System.out.println("Fibonacci total = " + fibTotal);

	}

}
