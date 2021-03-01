package com.list;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            LinkedList l=new LinkedList();
            l.add(1);
            l.add("a");
            l.add("b");
            l.add(10.25);
            l.addFirst(10);
            l.addLast(20);      // addLast() always should be at last
            // l.add("z");
           // l.addAll(l);
           // l.remove("a");
            //l.removeAll(l);
           
            
           System.out.println(l);
           System.out.println("____________________________");
           System.out.println(l.size());
           System.out.println("____________________________");
           System.out.println(l.contains("x"));
           System.out.println("____________________________");
           System.out.println(l.getFirst());
           System.out.println("____________________________");
           System.out.println(l.get(3));
           System.out.println("____________________________");
           System.out.println(l.getLast());
           System.out.println("____________________________");
            
           for(Object object:l){
        	  // String s=object.toString();
            	System.out.println(object);
            }   
         ArrayList al=new ArrayList();
         al.add(l);
         System.out.println(al);
         
	}

}
