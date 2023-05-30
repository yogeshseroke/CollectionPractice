package codingPractice;

public class PalindromExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcbab";
		String str = "";
		for(int i=s.length()-1; i>=0; i--) {
			str = str + s.charAt(i);
		}
		
		if(str.equals(s)) {
			System.out.println("palindrom");
			}
		else {
			System.out.println("Not palindrom");
			}
		
	}

}
