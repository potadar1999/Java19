package com.secQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Raibag");
		list.add("Belagavi");
		list.add("Hubli");
		list.add("Chikodi");
		list.add("Bengaluru");
		list.add("Karnataka");
		
		
		list.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(list);
		
		
		
		
		
//		X i1=City::list;
		
	}

}
