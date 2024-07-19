import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("Enter first number:");
        n1 = input.nextInt();
        System.out.print("Enter second number:");
        n2 = input.nextInt();
        System.out.print("Enter third number:");
        n3 = input.nextInt();
        System.out.print("Enter fourth number:");
        n4 = input.nextInt();
        if(n1>n2 && n1>n3 && n1>n4){
            System.out.println(n1+" is largest !!");
        } else if(n2>n1 && n2>n3 && n2>n4){
            System.out.println(n2+" is largest !!");
        } else if(n3>n1 && n3>n2 && n3>n4){
            System.out.println(n3+" is largest !!");
        } else {
            System.out.print(n4+" is largest !!");
        }
    }
}