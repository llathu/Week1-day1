package week1.day1;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int FirstNum = 0;
		int SecondNum = 1;
		int ThirdNum;
		System.out.println(FirstNum);
		System.out.println(SecondNum);
		
		for (int i = 1; i <=8; i++) {
			
			ThirdNum = FirstNum + SecondNum;
			FirstNum = SecondNum;
			SecondNum = ThirdNum;
			
			System.out.println(ThirdNum);
		}		

	}

}
