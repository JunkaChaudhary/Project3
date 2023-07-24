package Pkg2;

public class Selenium 
{
	int junka=233;
	public void abc(int junka)
	{
		this.junka=junka;
	}
	public static void main(String[] args) 
	{
		Selenium obj1= new Selenium();
		obj1.abc(150);		
		System.out.println(obj1.junka);
	}

}
