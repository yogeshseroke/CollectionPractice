package comparatorExample;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Student> obj = new TreeSet<Student>(new RnoComaprator());
		
		obj.add(new Student(101,"A",20000));
		obj.add(new Student(102,"B",50000));
		
		for(Student s : obj) {
			System.out.println(s.rn+" "+s.name+" "+s.fees);
		}
	}

}
