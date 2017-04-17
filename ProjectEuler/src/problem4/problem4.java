package problem4;


public class problem4 {

	public static void main(String[] args) {
		// Find largest palindrome from the product of 2 3 digit numbers
		
		int largestPal = 0;
		int currentProduct = 0;
		String forward;
		StringBuilder reverse = new StringBuilder();
		
		for (int loopCounter = 0; loopCounter < 1000; loopCounter++){
			
			for (int innerLoop = 0; innerLoop < 1000; innerLoop++){
				
				currentProduct = loopCounter * innerLoop;
				
				//System.out.println("currentProduct = " + currentProduct);
				
				forward = Integer.toString(currentProduct);
				
				reverse.setLength(0);
				reverse.append(forward);
				reverse = reverse.reverse();
				
				//System.out.println("forward = " + forward + " reverse = " + reverse.toString());
				
				if (forward.equals(reverse.toString())){
					if (currentProduct > largestPal){
						largestPal = currentProduct;
					}
				}
				
						
				
			}
			
		}
		
		System.out.println("The largest palindrome is " + largestPal);

	}

}
