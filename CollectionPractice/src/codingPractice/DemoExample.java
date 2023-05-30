package codingPractice;

import java.util.HashMap;
import java.util.Map;

public class DemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<String, String> mp = new HashMap<String, String>();
//		//multiple null value...
//		mp.put(null, null);
//		mp.put(null, null);
//		System.out.println(mp.size());
//		
//		*
//		# *
//		* # *
//		# * # *
//		* # * # *
		
		//i=0,2,4 
//		for(int i=1; i<=5; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				if((i%2==0) && (j%2==0) && j==1) {	 
//					System.out.print("# ");
//			}else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//	}
//		
//		
//		
		
		
		int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
	}
}
