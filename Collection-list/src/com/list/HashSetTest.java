package com.list;
import java.util.HashSet;

import javax.swing.plaf.synth.SynthSliderUI;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              HashSet h=new HashSet();
              h.add(10);
              h.add(20);             // insertion order not maintain 20 10 30
              h.add(30);
              h.add(10);             // current is replaced by old one
              h.add(null);
              
              System.out.println(h);
              System.out.println(h.size());
              
              
              for(Object obj: h) {
            	  Integer i=(Integer) obj;
            	  System.out.println(i);
              }
              
              HashSet equality=new HashSet<>();
              equality.add("abc");
              equality.add(new String("abc"));        //abc
              
              System.out.println(equality);
	}

}
