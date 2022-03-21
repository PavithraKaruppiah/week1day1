package week1.day1;

public class FibonacciSeries {
//Input 0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0;
		int secNum=1;
		int sum;
		
		
		for(int i =1; i <=13; i ++) {
			sum = firstNum+secNum;
			System.out.println(sum);

			firstNum=secNum;
			secNum=sum;
			
			
		}
		
	}

}
