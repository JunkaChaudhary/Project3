package Pkg2;

public class Student 
{
	public int sum(int a, int b)
	{
		return(a+b);
	}
	
	public int sub(int a, int b)
	{
		return(a-b);
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) 
	{
		Student obj1 = new Student();
		int sumresult = obj1.sum(10, 2);
		int subresult = obj1.sub(10, 2);
		int mulresult = obj1.mul(sumresult, subresult);
		System.out.println(mulresult);
	}
}
