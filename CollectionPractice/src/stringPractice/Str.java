package stringPractice;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "abcabd";
//		int count = 0;
//		char ch[] = s.toCharArray();
//		
//		for(int i=0; i<=ch.length-1; i++) {
//			for(int j=0; j<=ch.length-1; j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//			}
//			if(count==0) {
//				System.out.println(ch[i]);
//			}
//		}
		
		
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the required String: ");
	      String str = sc.next();
	      System.out.println("Enter the required character: ");
	      char ch = sc.next().toCharArray()[0];
	      //Invoking the index of method
	      int i = str.indexOf(ch);
	      if(i!=-1) {
	         System.out.println("Sting contains the specified character");
	      } else {
	         System.out.println("String doesn’t contain the specified character");
	      }
		
	}

}
