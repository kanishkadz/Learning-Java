import java.util.Scanner;

class Employee {
    String name;
    String designation;
    int basic;
    float gs;
    float da;
    float pf;
    float ns;

    public void getEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter designation: ");
        designation = sc.nextLine();
        System.out.print("Enter basic salary: ");
        basic = sc.nextInt();
        sc.close();
    }

    public void calSal() {
        da = basic * 0.45f;
        pf = basic * 0.125f;
        gs = basic + da;
        ns = gs - pf;
    }

    public void showEmp() {
        System.out.println("Name = " + name);
        System.out.println("Designation = " + designation);
        System.out.println("Net Salary = " + ns);
    }

    public static void main(String args[]) {
        Employee ob = new Employee();
        ob.getEmp();
        ob.calSal();
        ob.showEmp();
    }
}
