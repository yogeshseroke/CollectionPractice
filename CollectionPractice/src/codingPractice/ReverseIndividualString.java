package codingPractice;

import java.util.Stack;

public class ReverseIndividualString {

	public static String reverseWord(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord + sb.toString() + " ";
		}
		return reverseWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseIndividualString.reverseWord("yogesh seroke"));

		// reverse individual word of string...

		String str = "Yogesh Seroke";

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				st.push(str.charAt(i));
			} else {
				while (st.isEmpty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
			while (st.isEmpty() == false) {
				System.out.print(st.pop());
			}
		}
	}

}
