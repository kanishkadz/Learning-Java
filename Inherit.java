import java.util.Scanner;
class Emp{
    int age, salary;
    String name;
    public void getEmp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        name = sc.nextLine();
        System.out.print("Enter age:");
        age = sc.nextInt();
        System.out.print("Enter salary:");
        salary = sc.nextInt();
    }
    public void showEmp(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);
    }
}
class Dept extends Emp{
    String des;
    char grade;
    int basic;
    public void getDept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter destination:");
        des = sc.nextLine();
        System.out.print("Enter grade:");
        grade = sc.charAt(0);     
        System.out.println("Enter salary:");
        basic = sc.nextInt();   
    }
    public void showDept(){
        System.out.println("Designation = "+des);
        System.out.println("Grade = "+grade);
        System.out.println("Basic Salary = "+basic);
    }
}
public class Inherit {
    public static void main(String[] args) {
        Dept ob = new Dept();
        ob.getEmp();
        ob.getDept();
        ob.showEmp();
        ob.showDept();
    }
}
