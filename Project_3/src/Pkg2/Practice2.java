package Pkg2;

public class Practice2 extends Practice
{
	public void m1()
	{

		System.out.println("Child Default method");
	}
	public void m2(int a)
	{
		System.out.println("Child One params method");
	}
	public void m3(int a, int b)
	{

		System.out.println("Child Two params method");
	}
	public void m4(int a, int b, int c)
	{
		super.m2(10);
		super.m4(1, 2, 3);
		super.m1();
		super.m3(4, 5);
		this.m3(10, 20);		
		this.m1();
		this.m2(20);
		System.out.println("Child Three params method");
	}

	public static void main(String[] args) 
	{
		Practice2 obj= new Practice2();
		obj.m4(1,2,3);
	}
}
