package codingPractice;

public class SmallestAndLargestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {5,8,14,7,13,9,12,6};
		
		int max=0;
		int small=ar[0];
		
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}else {
				if(ar[i]<small) {
					small=ar[i];
				}
			}
		}
		System.out.println("smallest = "+small+", largest = "+max);
	}

}
