package com.miit.javatraining;

class Calc {  //Parent Class/super class
	public int add(int i, int j)

{
	return i+j;
}
}
class  Adsu extends Calc{  //child/sub class
	public int sub(int i, int j)
	{
		return i -j;
	}
}

class Adm extends Adsu{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class Calculator {
public static void main(String[] args) {
	Adm c1 = new Adm();
	int result = c1.add(5, 9);
	int result1 = c1.sub(5, 9);
	int result2 = c1.sub(5, 9);
	
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
}
}
	
