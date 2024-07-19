import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        float b;
        double c;
        String d;
        System.out.print("Enter integer:");
        a=input.nextInt();
        System.out.print("Enter float:");
        b=input.nextFloat();
        System.out.print("Enter double:");
        c=input.nextDouble();
        System.out.print("Enter String:");
        d=input.next();
        System.out.println("A = "+a+" B= "+b);
        System.out.println("C = "+c+" D = "+d);
    }
}