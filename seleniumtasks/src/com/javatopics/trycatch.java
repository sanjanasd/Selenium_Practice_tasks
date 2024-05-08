package com.javatopics;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a= {1,2,3};
//		System.out.println(a[3]);
		try {
			int [] a= {1,2,3};
			System.out.println(a[3]);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println(" Finallly executed");
		}
		

	}

}
