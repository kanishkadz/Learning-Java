import java.util.Scanner;
class Hotel
{
	private int rno;
	private String name;
	private int tariff;
	private int nod;
	private double amount;
	private double Calc()
	{
		amount=nod*tariff;
		if(amount>10000)
			return 1.05*amount;
		else
			return amount;
	}
	public void Checkin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Room No.:");
		rno=sc.nextInt();
		System.out.print("Enter Name:");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter Tariff:");
		tariff=sc.nextInt();
		System.out.print("Enter No. of days:");
		nod=sc.nextInt();
	}
	public void Checkout()
	{
		System.out.println("Room No.:"+rno);
		System.out.println("Name:"+name);
		System.out.println("Tariff:"+tariff);
		System.out.println("No. of days:"+nod);
		System.out.println("Amount:"+Calc());
	}
	public static void main(String arg[])
	{
		Hottel ob=new Hottel();
		ob.Checkin();
		ob.Checkout();
	}
}