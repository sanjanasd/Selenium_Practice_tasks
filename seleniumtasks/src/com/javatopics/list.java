

package com.javatopics;

import java.util.LinkedList;

public class list {
	public static void main(String[] args) {
		// TODO Auto-geneObjectmethod stub
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add(10);
		l1.add('C');
		l1.add("Sreya");
		l1.add(90.0);
		l1.add(true);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.element());
		System.out.println(l1.poll());
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		

	}

}
