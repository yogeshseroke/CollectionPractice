package codingPractice;

import java.util.Stack;

public class ReverseStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "yogesh";
		System.out.println(s);
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		
	}

}
