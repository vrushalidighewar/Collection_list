package com.list;
import java.util.Comparator;

public class IdWiseSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student stud1=(Student) o1;
		Student stud2=(Student) o2;
		
		if(stud1.getId() == stud2.getId())
		    return 0;
		else if(stud1.getId() > stud2.getId())
			return 1;
		else
			return -1;
	}

}
