import java.util.Scanner;
class Employee
{
	String name;
	String deg;
	double bs,da,pf,gs,ns;
	public void getEmp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		name=sc.nextLine();
		System.out.print("Enter Degisnation:");
		deg=sc.nextLine();
		System.out.print("Enter Basic Salary:");
		bs=sc.nextDouble();
	} 

	public void calSalary()
	{
		da=(bs*45)/100;
		pf=(bs*12.5)/100;
		gs=bs+da;
		ns=bs-pf;
	}
	public void showEmp(){
		System.out.println("Name:"+name);
		System.out.println("Desig:"+deg);
		System.out.println("Basic:"+bs);
		System.out.println("DA:"+da);
		System.out.println("PF:"+pf);
		System.out.println("GS:"+gs);
		System.out.println("NS:"+ns);	
	}
	public static void main(String arg[])
	{
		Employee ob=new Employee();	//Object creation statement
		ob.getEmp();
		ob.calSalary();
		ob.showEmp();
	}
}