package com.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {

	List colors = null;
	List product = null;
	Scanner sc = new Scanner(System.in);

	public void addColors() {
		colors = new ArrayList();
		System.out.println("Enter no. of colors");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			Color c = new Color();
			System.out.println("Enter color id");
			c.setCid(sc.nextInt());
			System.out.println("Enter color name");
			c.setCname(sc.next());
			colors.add(c);
		}
	}

	public void displayColors() {
		if (!colors.isEmpty()) {
			for (Object object : colors) {
				Color cc = (Color) object;
				System.out.println(cc.getCid() + " " + cc.getCname());

			}
		}
	}

	public void addProduct() {
		System.out.println("Enter no.of products");
		int no = sc.nextInt();
		product = new ArrayList();

		for (int j = 0; j < no; j++) {
			Product p = new Product();
			System.out.println("Enter product id");
			p.setId(sc.nextInt());
			System.out.println("Enter product name");
			p.setName(sc.next());
			System.out.println("-----------------------");
			displayColors();
			System.out.println("-----------------------");
			List cs = new ArrayList();
			System.out.println("How many Colors u want");
			int nc = sc.nextInt();
			for (int k = 0; k < nc; k++) {
				System.out.println("Enter color id for allocating color");
				int cid = (sc.nextInt());
				for (Object obj : colors) {
					Color c = (Color) obj;
					if (c.getCid() == cid) {
						cs.add(c); // allocation
					}
				}
				p.setColors(cs); // has a
			}
			product.add(p);
		}
	}

	public void displayProduct() {
		if (!product.isEmpty()) {
			System.out.println("-----------------------");
			for (Object ob : product) {
				Product pp = (Product) ob;
				
               //3 System.out.println(pp.getColors());
				
				/*for(Object object: colors) {
					Color cc=(Color) object;
					System.out.println(cc.getCname().getId());*/
				
				
                if (!pp.getColors().isEmpty()) {
					for (Object o : pp.getColors()) {
						Color c = (Color) o;
	                  //  System.out.println();
						System.out.println(pp.getId() + " " + pp.getName()+" "+c.getCid() + " " + c.getCname());
						//System.out.println();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ProductTest p = new ProductTest();
		p.addColors();
		// p.displayColors();
		p.addProduct();
		p.displayProduct();

	}

}
