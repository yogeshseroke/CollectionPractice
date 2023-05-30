package codingPractice;

public class SwapTwoStringsWithoutUsingThirdVaraible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABC";//XYZ
		String s2 = "XYZ";//ABC
		
		s1 = s1+s2;//ABCXYZ
		s2 = s1.substring(0, s1.length()-s2.length());//ABC
		s1 = s1.substring(s2.length());
		
		System.out.println("s1 = "+s1+", s2 = "+s2);
			
	}

}
