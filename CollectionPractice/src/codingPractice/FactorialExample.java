package codingPractice;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		int n=num;
		int result=0;
		for(int i=1; i<n; i++) {
			num=num*i;
			result=num;
		}
		System.out.println(result);
		
	}

}
