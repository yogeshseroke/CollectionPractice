package collectionPractice.stack;

import java.util.Stack;

public class StackExample {

	static void push(Stack<Integer> stack) {
		for(int i=0; i<5; i++) {
			stack.push(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.search(1);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s.pop());
		System.out.println(s);
	}
	

}
