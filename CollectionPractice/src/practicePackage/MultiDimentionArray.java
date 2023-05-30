package practicePackage;

public class MultiDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,20},{13,20}};
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr.length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//max
//		int max = 0;
//		for(int i=0; i<=arr.length-1; i++) {
//			for(int j=0; j<=arr.length-1; j++) {
//				if(arr[i][j]>max) {
//				
//					max = arr[i][j];
//				}
//				
//			}
//		}
//		System.out.println(max);
		
		
		//second max
		
		int max = 0;
		int secMax = 0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				if(arr[i][j]>max) {
					secMax=max;
					max=arr[i][j];
				}else if(arr[i][j]>secMax && arr[i][j]<max) {
					secMax=arr[i][j];
				}
			}
		}
		System.out.println(secMax);
	}

}
