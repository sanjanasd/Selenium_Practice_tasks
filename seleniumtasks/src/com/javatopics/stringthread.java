package com.javatopics;

public class stringthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1= new StringBuffer("hello");
		System.out.println(s1.charAt(0));
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s1.reverse());
		System.out.println(s1.length());
		System.out.println("----------------------");
		StringBuilder s2= new StringBuilder("hello");
		System.out.println(s2.charAt(0));
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		System.out.println(s2.reverse());
		System.out.println(s2.length());
		}
   }
