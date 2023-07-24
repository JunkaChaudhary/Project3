package Pkg2;

public class SonTwo extends Son
{
	public void m1()
	{
		System.out.println("Son Two method");
	}

	public static void main(String[] args) 
	{
		SonTwo obj2 = new SonTwo();
		obj2.abc();
		obj2.xyz();
		obj2.m1();
		//obj2.b=40;
		obj2.a=30;
		System.out.println(obj2.b);
		System.out.println(obj2.a);
	}
}
