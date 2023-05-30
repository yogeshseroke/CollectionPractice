package queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Object> obj = new PriorityQueue<>();
//		obj.add("A");
//		obj.add("Z");
//		obj.add("D");
//		obj.add("B");
//
//		System.out.println(obj);
//		for(Object o : obj) {
//			System.out.println(o);
//		}
		
//		obj.remove();
//		System.out.println(obj);
//		
//		obj.remove();
//		System.out.println(obj);
//		for(int i=0; i<obj.size(); i++) {
//			System.out.println(obj);
//		}

//		obj.add(8);
//		obj.add(4);
//		obj.add(20);
//		obj.add(2);
//		
//		System.out.println(obj);
//	
//		obj.remove();
//		System.out.println(obj);
		
		
//		ArrayList<Integer> obj1 = new ArrayList<>();
//		obj1.add(10);
//		obj1.add(12);
//		obj1.add(13);
//		Iterator<Integer> i = obj1.iterator();
//		while(i.hasNext())
//		{
//		   System.out.println(i.next());
//		}
		
		ArrayList<Integer> obj1 = new ArrayList<>();
		obj1.add(10);
		obj1.add(12);
		obj1.add(13);
		
		ListIterator<Integer> l = obj1.listIterator();

		while(l.hasNext())
		{
		   System.out.println(l.next());
		}

		while(l.hasPrevious())
		{
		   System.out.println(l.previous());
		}
		
	}

}
