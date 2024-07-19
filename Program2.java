import java.util.Scanner;

public class Program2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int payment;
        int days;
        float rate;
        float si;
        System.out.print("Enter payment:");
        payment = input.nextInt();
        System.out.print("Enter no. of days:");
        days = input.nextInt();
        System.out.print("Enter rate of interest:");
        rate = input.nextFloat();
        si=(payment*rate*days)/100;
        System.out.print("Simple interest is:"+si);
    }
}