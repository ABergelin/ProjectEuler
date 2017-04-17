package problem5;

public class problem5 {

	public static void main(String[] args) {
		// Working out the smallest number that can be divided by the numbers 1-20 with no remainder
		
		boolean resultFound = false;
		boolean interimResult = false;
		int numberToDivide = 1;
		
		
		while (!resultFound){
			
			//loop through numbers 1-10
			for (int loopCount = 1; loopCount < 21; loopCount++){
				if (numberToDivide%loopCount==0){
					interimResult = true;
				} else {
					interimResult = false;
					loopCount = 21;
				}
				
			}
						
			if (interimResult){
				resultFound = true;
				System.out.println("resultFound = true. numberToDivide = "+ numberToDivide);
			}
				
			
			numberToDivide ++;
			//System.out.println("numberToDivide = " + numberToDivide);
			
		}

	}

}
