package collectionPractice.linkedList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList lst = new LinkedList();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		lst.addFirst(0);
		lst.addLast(4);
		
		System.out.println(lst);
		
		LinkedList vr1 = new LinkedList();
		

		vr1.add('1');
		vr1.add('2');
		vr1.add('3');
		vr1.add('A');
		vr1.add('B');
		vr1.add('C');
		vr1.add("ABC");
		vr1.add("DEF");

		System.out.println(vr1);
	}

}
