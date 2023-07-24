package Pkg2;

import Pkg1.Class1;

public class Class3 extends Class2
{	
	public void m1()
	{
		this.m3(1, 2);
		System.out.println("Child M1 method");
	}
	
	public void m2(int a)
	{
		this.m1();
		System.out.println("Child M2 method");
	}
	public void m3(int a, int b)
	{
		super.m2(2);
		super.m4(1, 2, 3);
		super.m1();
		super.m3(1, 2);
		System.out.println("Child M3 method");
	}
	public void m4(int a, int b, int c)
	{
		this.m2(1);
		System.out.println("Child M4 method");
	}
	public static void main(String[] args) 
	{
		Class3 obj1 = new Class3();
		obj1.m4(1,2,3);
		
	}

}
