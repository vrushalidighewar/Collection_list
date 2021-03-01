package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
          
		   Student s1=new Student();
           s1.setId(101);
           s1.setName("V");
           s1.setAge(20);
          
           Student s2=new Student();
           s2.setId(105);
           s2.setName("R");
           s2.setAge(22);

		   Student s3=new Student();
           s3.setId(108);
           s3.setName("P");
           s3.setAge(19);

		   Student s4=new Student();
           s4.setId(103);
           s4.setName("L");
           s4.setAge(18);
           
           List list=new ArrayList();
           list.add(s1);
           list.add(s2);
           list.add(s3);
           list.add(s4);
           
           list.forEach(System.out :: println);
           
           System.out.println("____________ age after sorting _____________");
           Collections.sort(list, new AgeWiseSorting());
           list.forEach(System.out :: println);
           
           System.out.println("____________ name after sorting _____________");
           Collections.sort(list, new NameWiseSorting());
           list.forEach(System.out :: println);
           
           System.out.println("____________ id after sorting _______________");
           Collections.sort(list, new IdWiseSorting());
           list.forEach(System.out :: println);
           
	}

}
