package practicePackage;

public class StringPalindromeExample {

	public static boolean isPalindrome(String str) {
		
		int left = 0;
		
		int right = str.length() - 1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "abcdcba";
//		
//		String s1 = "";
//		
//		char ch[] = s.toCharArray();
//		
//		for(int i=ch.length-1; i>=0; i--) {
//		//	s1 = s1 + ch[i];
//			s1 = s1 + s.charAt(i);
//		}
//		
//	
//		if(s1.equals(s)) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
		
//		String para = "hello i am java developer. I am from indore.";
//		
//		StringBuilder sb = new StringBuilder(para);
//
//		System.out.println(sb);
//		
//		sb.reverse();
//		
//		System.out.println(sb);
		
		//find palindrome in given paragraph...
		String para = "abcbcba andfg lalakalal otiru mamam";
		
		//String words[] = para.split("\\s+");
		String words[] = para.split(" ");
		for(String word : words) {
			if(isPalindrome(word)) {
				System.out.println(word + " is palindrome");
			}
		}
		
	}
}