package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int sum = 0;
		int OrgInput = input; 
				while (input > 0)
				{
					int reminder = input % 10;
							sum = sum + (reminder * reminder * reminder);
							input = input / 10;
														
				}
					System.out.println("Sum of the cube of the numbers = " + sum);
					if (OrgInput == sum) {
						System.out.println(OrgInput + " is a Armstrong Number");
					}
					else {
						System.out.println(OrgInput + " is not a Armstrong Number");
						
					}
		

	}

}
