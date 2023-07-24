package Pkg2;

public class College1 
{
	public College1()
	{
		this(1,2,3);
		System.out.println("Parent default contructor");
	}
	public College1(int a)
	{
		this();
		System.out.println("Parent One params contructor");
	}
	public College1(int a, int b)
	{
		this(1);
		System.out.println("Parent Two params contructor");
	}
	public College1(int a, int b, int c)
	{
		System.out.println("Parent Three params contructor");
	}
	public College1(int a, int b, int c, int d)
	{
		System.out.println("Parent Four params contructor");
	}

}
