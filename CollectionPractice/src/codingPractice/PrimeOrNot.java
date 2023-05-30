package codingPractice;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		int i=1,count=0;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
	}

}
