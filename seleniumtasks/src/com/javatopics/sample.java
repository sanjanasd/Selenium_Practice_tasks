package com.javatopics;
class inherit {
	int sal=1000;
}
 class inherit1 extends inherit{
	int bonus = 3444;
}
 class inherit2 extends inherit1{
	 int increment = 355;
 }
 class sample {
 
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		inherit2 h = new inherit2();
 		System.out.println(h.sal);
 		System.out.println(h.bonus);
 		System.out.println(h.increment);
 		
 				
 		  
		

	}

}
