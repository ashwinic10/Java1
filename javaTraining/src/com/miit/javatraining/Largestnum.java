package com.miit.javatraining;

public class Largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {2,98,56,85,-1};
 
 int min = arr[0];
 int max = arr[0];
 
 for(int i=0; i<arr.length; i++) {
	 if(arr[i]<min) {
		 min = arr[i];
	 }
	 if(arr[i]>max) {
		 max= arr[i];
	 }
 }
 System.out.println("Smallest Number"+ min +"Largest Number"+max);
	}

}
