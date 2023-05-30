package codingPractice;

public class SecMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[] = {68,68,68,8,49,39,39,53,76,76};
		int temp=0;
		int max=0,secMax=0;
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i+1; j<=ar.length-1; j++) {
//			if(ar[i]>ar[j]) {
//				temp=ar[i];
//				ar[i]=ar[j];
//				ar[j]=temp;
//			}
//			if(ar[i]!=ar[j]) {
//				secMax = ar[i];
//			}
//			}
//			System.out.println(ar[i]);			
//		}
//		System.out.println(secMax);
		
		for(int i=0; i<=ar.length-1; i++) {
			if(ar[i]>max) {
				secMax=max;
				max=ar[i];
			}else if(ar[i]>secMax && ar[i]<max) {
				secMax = ar[i];
			}
			}
		System.out.println(secMax);			
		}


	}


