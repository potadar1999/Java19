package com.Que;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list=new ArrayList<>();
		list.add(new Product(10,"pen",50,570));
		list.add(new Product(20,"book",15,50));
		list.add(new Product(30,"rubber",75,150));
		list.add(new Product(40,"scale",40,500));
		
		
		list.sort((s1,s2)->s1.getPrice()>s2.getPrice()? 1:-1);
		list.forEach(System.out::println);
	}



}
