package com.miit.javatraining;

class Inheritance {
 int z;
 
  void sum(int x, int y) {
	 z = x +y;
	 System.out.println("Sum is"+z);
 }
  void Subtraction(int x, int y) {
	 z = x - y;
	 System.out.println("difference is"+z);
 }
}

 class Inherit extends Inheritance{
	void multiplication(int x, int y) {
		z = x * y;
		System.out.println("Product is"+z);
	}
	
	public static void main(String args[]) {
		int a = 50,  b = 20;
		Inheritance i = new  Inheritance();
		i.sum(a, b);
		i.Subtraction(a, b);
		//i.multiplication(a,b);
		
		
	}
}
