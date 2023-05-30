package codingPractice;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {9,3,8,4,20,0};
		int max=0,secMax=0;
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				secMax=max;
				max=ar[i];

			}else if(ar[i]>secMax){
				secMax=ar[i];
			}
		}
		System.out.println("max = "+max+" second max = "+secMax);
	}

}
