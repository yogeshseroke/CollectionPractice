package codingPractice;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is yogesh Seroke. I am from @!#$%^& and I have knowledge about 93475 language";
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9' ) {
				count1++;
			}
			
			if(s.charAt(i)=='!' || s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='$' || s.charAt(i)=='%' || s.charAt(i)=='^' || s.charAt(i)=='&' || s.charAt(i)=='*' || s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='~' || s.charAt(i)=='`' || s.charAt(i)=='_' || s.charAt(i)=='-' || s.charAt(i)=='+' || s.charAt(i)=='=' || s.charAt(i)=='{' || s.charAt(i)=='}' || s.charAt(i)=='[' || s.charAt(i)==']' || s.charAt(i)=='|' || s.charAt(i)==':' || s.charAt(i)==';' || s.charAt(i)=='"' || s.charAt(i)=='?' || s.charAt(i)=='/' || s.charAt(i)=='>' || s.charAt(i)=='.' || s.charAt(i)=='<' || s.charAt(i)==',' ) {
				count2++;
			}
			
			int n1=97;
			while(n1!=122) {
				if(s.charAt(i)==n1) {
					count3++;
				}
				n1++;
			}
			
			int n2=65;
			while(n2!=90) {
				if(s.charAt(i)==n2) {
					count4++;
				}
				n2++;
			}
		}
		System.out.println("numeric = " +count1);
		System.out.println("special character = "+count2);
		System.out.println("small alphabet = "+ count3);
		System.out.println("capital alphabet = "+ count4);
	}

}
