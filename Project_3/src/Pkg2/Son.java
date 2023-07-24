package Pkg2;

public class Son extends Father 
{
	final int b=25;
	public void xyz()
	{
		System.out.println("Son method");
	}

	public static void main(String[] args) 
	{
		Son obj1 = new Son();
		obj1.abc();
		obj1.xyz();
		obj1.a=10;
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
}
