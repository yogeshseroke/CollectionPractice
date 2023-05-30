package collectionPractice.vectorExample;

import java.util.Vector;

public class VectorExample {

	public static void main(String args[]) {
		
	//vector using integer...
		
	Vector<Integer> vr = new Vector<Integer>();
	
	vr.add(1);
	vr.add(2);
	vr.add(3);
	vr.add(4);
	vr.add(5);
	vr.add(6);
	vr.add(7);
	vr.add(8);
	
	System.out.println(vr);

	for(int i=0; i<5; i++) {
		System.out.println(vr);
	}
	
	vr.remove(5);

	System.out.println(vr);


	//Vector using object...
	
	Vector vr1 = new Vector();
	

	vr1.add(1);
	vr1.add(2);
	vr1.add(3);
	vr1.add('A');
	vr1.add('B');
	vr1.add('C');
	vr1.add("ABC");
	vr1.add("DEF");
	
	System.out.println(vr1);
	
	vr1.removeAll(vr1);
	System.out.println(vr1+"removeAll");

	//update vector...
		Vector vr2 = new Vector();
		vr2.add(1);
		vr2.add("abc");
		vr2.add('a');
		vr2.add(12.2);
		vr2.add(233.321);
		
		System.out.println(vr2);
		vr2.set(1, 2);
		vr2.set(4, 'b');
		
		System.out.println(vr2);
		
		for(int i=0; i<vr2.size(); i++) {
			System.out.println(vr2.get(i));
		}

	}
}
