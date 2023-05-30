package codingPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5847;
		System.out.println(num);
		int r,reverseNum=0;
		while(num != 0) {
			r=num%10;
			num=num/10;
			reverseNum=reverseNum*10+r;
		}
		System.out.println(reverseNum);
		
	}

}
