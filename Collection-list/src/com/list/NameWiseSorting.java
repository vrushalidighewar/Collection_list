package com.list;
import java.util.Comparator;

public class NameWiseSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Student stud1=(Student) o1;
		Student stud2=(Student) o2;
		
		return stud1.getName().compareTo(stud2.getName());
	}

}
