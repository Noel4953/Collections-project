package com.revature.app.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
	arrayList.add(1);
	arrayList.add(100);
	arrayList.add(200);
	//arrayList.add("Jas");
	
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	a2.add(1111);
	a2.add(2222);
	System.out.println(a2);
	a2.add(1, 3333);
	
	System.out.println(a2);	
	
	Iterator itr = arrayList.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	for(int i=0; i<arrayList.size();i++)
		System.out.println(arrayList.get(i));
	
	arrayList.addAll(a2);
	
	for(int i:arrayList) {
		System.out.println(i);
	}
	
}
}
