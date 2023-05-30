package codingPractice;

import java.util.Scanner;

public class PalindromNumberUsingRecursion {

	static int sum=0,rem;
	
	static int isPalindrom(int num) {
		if(num == PalindromNumberUsingRecursion.reverse(num)) {
			return 1;
		}
		return 0;
	}
	
	static int reverse(int num) {
		if(num != 0) {
			rem=num%10;
			sum=sum*10+rem;
			reverse(num/10);
		}else {
			return sum;
		}return sum;
	}
	
	public static void main(String[] args) {
			int result;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number ...");
			int originalNumber = sc.nextInt();
			result = PalindromNumberUsingRecursion.isPalindrom(originalNumber);
			if(result == 1) {
				System.out.println("palindrome");
			}else {
				System.out.println("not palindrome");
			}
	}

}
