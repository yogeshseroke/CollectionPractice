package codingPractice;

public class ArmstrongNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 372;//371, 153
		int n = num,r,result=0;
		while(num!=0) {
			r = num%10;
			num = num/10;
			result = result + (r*r*r);
		}
		if(result == n) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
