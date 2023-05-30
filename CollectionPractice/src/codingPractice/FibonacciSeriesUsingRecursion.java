package codingPractice;

public class FibonacciSeriesUsingRecursion {

	public static int fibonacciUsingRecursion(int num) {
		if(num == 0) {
			return 0;
		}if(num == 1 || num == 2) {
			return 1;
		}
		return fibonacciUsingRecursion(num-2) + fibonacciUsingRecursion(num-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum = 10;
		System.out.println("fibonacci series of "+maxNum+" = ");
		for(int i=0; i<=maxNum; i++) {
			System.out.print(fibonacciUsingRecursion(i)+" ");
		}
	}

}
