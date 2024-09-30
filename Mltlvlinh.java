import java.util.Scanner;
class Company
{
	String name;
	String loc;
	public void getCo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		name=sc.nextLine();
		System.out.print("Enter Location:");
		loc=sc.nextLine();
	}
	public void showCo()
	{
		System.out.println("Name:"+name);
		System.out.println("Location:"+loc);
	}
}
class Department extends Company
{
	char grd;
	String dsg;
	public void getDep()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Grade:");
		grd=sc.next().charAt(0);
		System.out.print("Enter Designation:");
		dsg=sc.nextLine();
		dsg=sc.nextLine();
	}
	public void showDep()
	{
		System.out.println("Grade:"+grd);
		System.out.println("Designation:"+dsg);
	}
}
class Employee extends Department
{
	int sal;
	int inc;
	public void getEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary:");
		sal=sc.nextInt();
		System.out.print("Enter Incentive:");
		inc=sc.nextInt();
	}
	public void showEmp()
	{
		System.out.println("Salary:"+sal);
		System.out.println("Incentive:"+inc);
	}	
}
class Mltlvlinh
{
	public static void main(String arg[])
	{
		Employee ob=new Employee();
		System.out.println("Company Details:");
		ob.getCo();
		ob.showCo();
		System.out.println("Department Details:");
		ob.getDep();
		ob.showDep();
		System.out.println("Employee Details:");
		ob.getCo();
		ob.getDep();
		ob.getEmp();
		ob.showCo();
		ob.showDep();
		ob.showEmp();
	}
}