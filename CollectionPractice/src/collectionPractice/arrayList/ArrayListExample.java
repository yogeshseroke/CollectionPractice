package collectionPractice.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String args[]) {
	
	//String type arrayList...	
	ArrayList<String> ar = new ArrayList<>();
	ar.add("A");
	ar.add("B");
	ar.add("C");
	ar.add("D");
	ar.add("E");
	ar.add("F");
	
	for(String s : ar) {
		System.out.println(s);
	}
	
	//Integer type arraylist...
	List<Integer> ar1 = new ArrayList<>();
	ar1.add(1);
	ar1.add(2);
	ar1.add(3);
	ar1.add(4);
	ar1.add(5);
	
	for(Integer a : ar1)
	{
		System.out.println(a);
	}
	
	//arrayList using iterator...
	Iterator<String> it = ar.iterator();
	while(it.hasNext()) {
		String s=it.next();
		System.out.println(s);
	}
	
	//arrayList using listIterator...
	ListIterator<Integer> lst = ar1.listIterator();
	while(lst.hasNext()) {
		Integer i = lst.next();
		System.out.println(i);
	}
	
	while(lst.hasPrevious()) {
		Integer i = lst.previous();
		System.out.println(i);
	}
	
	//=================================
	
	ArrayList vr1 = new ArrayList();
	

	vr1.add('1');
	vr1.add('2');
	vr1.add('3');
	vr1.add('A');
	vr1.add('B');
	vr1.add('C');
	vr1.add("ABC");
	vr1.add("DEF");

	for(Object o : vr1) {
		System.out.println(o);
	}
	}
}
