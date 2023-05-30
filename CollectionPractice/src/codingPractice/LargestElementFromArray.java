package codingPractice;

public class LargestElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {100,6,9,5,8,300,70};
		int max=0;
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
