package com.list;
import java.util.LinkedHashSet;
public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              LinkedHashSet lhs=new LinkedHashSet<>();
              lhs.add(1);
             // lhs.add(1);          // duplicate not allowed
              //lhs.add(null);
            //  lhs.add(null);
              lhs.add("a");         //capacity (16) and load factor (0.75).
              lhs.add("b");
              lhs.add("c");
              lhs.add("d");
              lhs.add("e");
              
              System.out.println(lhs);
              System.out.println("---------");
              System.out.println(lhs.size());
              System.out.println("---------");
             

              for(Object object : lhs) {
            	  String s=object.toString();
            	  //Integer i=(Integer)object;
            	  System.out.println(s);
              }
	}

}
