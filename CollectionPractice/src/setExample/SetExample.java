package setExample;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> obj = new HashSet<>();
		obj.add("C");
		obj.add("c++");
		obj.add("Java");
		obj.add("Python");
		obj.add(null);
		obj.add("c");
	
		A obj1 = new A();
		
		obj.add(obj1.a);
		obj.add(obj1.b);
		for(String s : obj) {
			System.out.println(s+" ");
		}
	}

}
