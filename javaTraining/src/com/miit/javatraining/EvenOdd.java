package com.miit.javatraining;


public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,6,8,1,52,5};
		System.out.print("EVEN nUMBER");
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		
		}
		int b[] = {5,3,6,8,1,52,5};
		System.out.print("odd nUMBER");
		for(int i =0;i<b.length;i++) {
			if(b[i]%2!=0) {
				System.out.println(a[i]);
			}
		
		}
		
		
	}

}
