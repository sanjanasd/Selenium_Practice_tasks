package com.javatopics;

class finals {
	
}	
final class A{ 	---> cannot inherit to another class
final int a=10;  --> cannot acces to another class 
final void method1() {
	System.out.println("hi");
}
class B extends A{
	//System.out.println(a);
	System.out.println(method1());
	int a=70;
	
}
}
