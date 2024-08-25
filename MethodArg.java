import java.util.Scanner;
class Student
{
	String name;
	int roll;
	double marks;
	public void setStudent(String n,int r,double m)
	{
		name=n;
		roll=r;
		marks=m;
	}
	public void showStudent()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll:"+roll);
		System.out.println("Marks:"+marks);
	}
}
class MethodArg
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String n1=sc.nextLine();
		System.out.print("Enter Roll:");
		int r1=sc.nextInt();
		System.out.print("Enter Marks:");
		double m1=sc.nextDouble();
		Student ob=new Student();
		ob.setStudent(n1,r1,m1);
		ob.showStudent();
	}
}