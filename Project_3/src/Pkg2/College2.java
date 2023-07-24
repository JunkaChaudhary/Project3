package Pkg2;

public class College2 extends College1
{
	public College2()
	{
		this(1,2);
		System.out.println("Child default contructor");
	}
	public College2(int a)
	{
		this();
		System.out.println("Child One params contructor");
	}
	public College2(int a, int b)
	{
		this(1,2,3);
		System.out.println("Child Two params contructor");
	}
	public College2(int a, int b, int c)
	{
		super(1,2);
		System.out.println("Child Three params contructor");
	}
	public College2(int a, int b, int c, int d)
	{
		System.out.println("Child Four params contructor");
	}
	
	public static void main(String[] args) 
	{
		College2 obj= new College2(10);
	}
}
