package com.miit.javatraining;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = new int[] { 5,6,83,8,1,1,1,83};
		int[] fq = new int[array.length];
		int i,j;
		int visited = -1;
		 for(i = 0; i < array.length;i++) {
			 int count = 1;
			 for(j=i+1;j<array.length;j++) {
				 if(array[i]==array[j]) {
					 count++;
					 
					 fq[j]= visited;
				 }
			 }
			 if(fq[i]!=visited)
				 fq[i]=count;
		 }
		 for(int k = 0; k<fq.length; k++) {
			 if(fq[k]!= visited)
		 System.out.println(""+array[k]+ "-" +fq[k]);
		 
			 
		 };
		

}}
