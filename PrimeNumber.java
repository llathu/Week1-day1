package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input = 13;
		
		for (int i = 2; i < input; i++) {
			
			if (input % i == 0) {
				
				System.out.println(input + " is a not prime number");
				break;
				
			} else {

				System.out.println(input + " is a prime number");
				break;
			}
					
			
		}
		

	}

}
