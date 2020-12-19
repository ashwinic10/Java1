package com.miit.javatraining;

public class Randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int min = 10;
		int max= 200;
		
		System.out.println("Random value generated between "+min+"to"+max+"is");
		 int a = (int)(Math.random()*(max-min+1)+min);
		 System.out.println(a);
		 
	}

}
