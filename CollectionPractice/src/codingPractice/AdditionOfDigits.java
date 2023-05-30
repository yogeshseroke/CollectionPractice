package codingPractice;

public class AdditionOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456789;
		int r=0,result=0;
		while(num!=0) {
			r = num%10;
			num = num/10;
			result = result + r;
		}
		System.out.println(result);
	}

}
