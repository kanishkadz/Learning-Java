import java.util.Scanner;
class Human
{
	String name;
	int age;
	float wt;
	double ht;
	public void getHuman()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		name=sc.nextLine();
		System.out.print("Enter Age:");
		age=sc.nextInt();
		System.out.print("Enter Weight:");
		wt=sc.nextFloat();
		System.out.print("Enter Height:");
		ht=sc.nextDouble();
	} 
	public void showHuman()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+wt);
		System.out.println("Height:"+ht);
	}
	public static void main(String arg[])
	{
		Human ob=new Human();	//Object creation statement
		ob.getHuman();
		ob.showHuman();
	}
}