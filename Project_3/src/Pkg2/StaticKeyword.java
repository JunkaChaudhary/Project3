package Pkg2;

public class StaticKeyword 
{
	static int a=100, c;
	int b=100;
	public static void m1()
	{
		a=a+1;
		System.out.println("Static method 1");
	}
	
	public void m2()
	{
		c=a+10;
		b=b+20;
		System.out.println("Non-Static method 2");
		
	}
	
	public static void main(String[] args) 
	{
		StaticKeyword.m1();
		System.out.println(a);
		StaticKeyword obj= new StaticKeyword();
		obj.m2();
		System.out.println(obj.b);
		System.out.println(obj.c);		
	}
}
