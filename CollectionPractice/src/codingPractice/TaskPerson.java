package codingPractice;

import java.util.Comparator;

public class TaskPerson implements Comparator{

	int age;
	String name;
	int salary;
	
	public TaskPerson(int age, String name, int salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		return 0;
	}
}
