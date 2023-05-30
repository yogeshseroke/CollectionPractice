package codingPractice;

public class TaskMain extends TaskPerson{

	public TaskMain(int age, String name, int salary) {
		super(age, name, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		/*
		 * person1 (age 30 , name C,8000)
    person2 (age 61 , name AA,7000)
    person3 (age 62 , name A,6000)
		 * 
		 * */
		
		TaskMain obj = new TaskMain(30,"C",8000);
		TaskMain obj1 = new TaskMain(61,"AA",8000);
		TaskMain obj2 = new TaskMain(62,"A",6000);
		
		//=obj.compare(obj1, obj2);
		
	}

}
