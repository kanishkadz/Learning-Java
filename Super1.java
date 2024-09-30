import java.util.Scanner;
class Teacher
{
	String name;
	String addr;
	String dob;
	Teacher(String name,String addr,String dob)
	{
		this.name=name;
		this.addr=addr;
		this.dob=dob;
	}
	public void showTeacher()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+addr);
		System.out.println("Date of Birth:"+dob);
	}
}
class Student extends Teacher
{
	String cls;
	int roll;
	Student(String name,String addr,String dob,String cls,int roll)
	{
		super(name,addr,dob);
		this.cls=cls;
		this.roll=roll;
	}
	public void showStudent()
	{
		System.out.println("Class:"+cls);
		System.out.println("Roll:"+roll);
	}
}
class Super1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String n=sc.nextLine();
		System.out.print("Enter Address:");
		String a=sc.nextLine();
		System.out.print("Enter Date of Birth:");
		String d=sc.next();
		System.out.print("Enter Class:");
		String c=sc.next();
		System.out.print("Enter Roll:");
		int r=sc.nextInt();
		Student ob=new Student(n,a,d,c,r);
		ob.showTeacher();
		ob.showStudent();
	}
}