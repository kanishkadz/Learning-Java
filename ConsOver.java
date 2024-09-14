import java.util.Scanner;
class Total{
    Total(int a, int b){
        int c = a + b;
        System.out.println("Sum of 2 integers is: "+c);
    }
    Total(int a, int b, int c){
        int d = a + b + c;
        System.out.println("Sum of 3 integers is: "+d);
    }
    Total(double a, double b){
        double c = a + b;
        System.out.println("Sum of 2 double is: "+c);
    }
}
public class ConsOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 integers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print("Enter 2 double:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Total ob1 = new Total(x, y);
        Total ob2 = new Total(x, y, z);
        Total ob3 = new Total(x1, y1);
    }
}
