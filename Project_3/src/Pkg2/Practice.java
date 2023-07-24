package Pkg2;

public class Practice 
{
	public void m1()
	{
		//this.m4(6, 7, 8);
		System.out.println("Parent Default method");
	}
	public void m2(int a)
	{
/*		this.m4(1,2,4);
		this.m1();
		this.m3(1,3);
		this.m5(1, 2, 3,4);
	*/	
		System.out.println("Parent One params method");
	}
	public void m3(int a, int b)
	{
		//this.m1();
		System.out.println("Parent Two params method");
	}
	public void m4(int a, int b, int c)
	{
		//this.m2(10);
		System.out.println("Parent Three params method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Parent Four params method");
	}
	
/*	public static void main(String[] args) 
	{
		Practice obj= new Practice();
		obj.m2(10);		
	}*/
}
