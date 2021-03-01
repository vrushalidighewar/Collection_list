package com.app;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(01);
		e.setName("Vrushali");

		ArrayList a = new ArrayList();
		a.add("A");
		a.add("B");
		a.add("b");
		a.add("c");
		a.add("c");
		a.add(e);
		a.add("d");
		a.add("e");
		a.add("e");
		a.add("e");
		a.add("e");
		// a.ensureCapacity(20);
		// a.trimToSize();

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("z"));

		Object obAr = a.toArray();
		System.out.println(obAr);

		// Iterator(interface) --one by one iteration
		/*
		 * Iterator itr=a.iterator(); while(itr.hasNext()) { // point out to elements
		 * Object o=itr.next(); // point out to elements System.out.println(o); if(o
		 * instanceof Employee) { Employee emp=(Employee) o; if(emp.getId()==01) {
		 * System.out.println(emp.getId()+ " " +emp.getName()); } } }
		 */
		// foreach
		for (Object obj : a) {
			System.out.println(obj);
		}
		// java 8
		a.forEach(System.out::println);

	}

}
