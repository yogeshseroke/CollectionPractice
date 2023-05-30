package comparatorExample;

import java.util.Comparator;

public class FeesComapartor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.fees>o2.fees) {
			return 1;
		}else if(o1.fees<o2.fees) {
			return -1;
		}else {
			return 0;
		}

	}

}
