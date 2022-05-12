package com.revature.app.list;

import java.util.HashSet;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class Setdemo {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	TreeSet<String> set1 = new TreeSet<String>();
	set.add("Robert");
	set.add("LEON");
	set.add("Sarah");
	set.add("Adam");
	set.add("Darian");
	
	set1.add("Robert");
	set1.add("LEON");
	set1.add("Sarah");
	set1.add("Adam");
	set1.add("Darian");
	
	for(String name:set)
		System.out.println(name);
	System.out.println(" ");
	for(String name:set1)
		System.out.println(name);
}
}
