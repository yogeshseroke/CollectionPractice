package comparatorExample;

import java.util.Comparator;

public class RnoComaprator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		if(o1.rn>o2.rn)
			return 1;
		else if(o1.rn<o2.rn) 
			return -1;
		else 
		return 0;
		
	}

}
