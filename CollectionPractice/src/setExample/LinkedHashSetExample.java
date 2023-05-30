package setExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet obj = new LinkedHashSet<>();
		obj.add("ABC");
		obj.add(123);
		obj.add(true);
		obj.add(12.34f);
		obj.add('x');
		obj.add(123.456);
		
		for(Object o : obj) {
			System.out.println(o);
		}
		
		System.out.println(obj);
	}

}
