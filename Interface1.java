import java.util.Scanner;
class A
{
	int a;
	public void setA(int x)
	{
		a=x;
	}
	public void showA()
	{
		System.out.println("Value of a:"+a);
	}
}
interface B
{
	final int b=20;
	public void setB();
}
class C extends A implements B
{
	int c;
	public void setB()
	{
		c=30;
		System.out.println("Value of b:"+b);
	}
	public void showC()
	{
		System.out.println("Value of c:"+c);
	}
}
class Interface1
{
	public static void main(String arg[])
	{
		C ob=new C();
		ob.setA(10);
		ob.showA();
		ob.setB();
		ob.showC();
	}
}