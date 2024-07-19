import java.util.Scanner;
public class Program4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = input.nextInt();
        if(n%7 == 0){
            System.out.print("Divisible bye 7 !!");
        }
    }
}