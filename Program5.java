import java.util.Scanner;
public class Program5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter first number:");
        n1 = input.nextInt();
        System.out.print("Enter second number:");
        n2 = input.nextInt();
        if(n1>n2){
            System.out.println(n1+" is largest !!");
        } else {
            System.out.println(n2+" is largest");
        }
    }
}