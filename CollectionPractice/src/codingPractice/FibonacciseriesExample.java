package codingPractice;

public class FibonacciseriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c=0;
		int num=10;
		for(int i=0;i<=num;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
