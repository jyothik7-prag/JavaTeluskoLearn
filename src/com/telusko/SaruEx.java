package com.telusko;

import java.util.Iterator;
import java.util.TreeSet;

public class SaruEx {

	public static void main(String[] args) {
	
		TreeSet tree = new TreeSet();
		tree.add("one");
		tree.add("two");
		tree.add("three");
		tree.add("four");
		tree.add("two");
		Iterator it=tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}
