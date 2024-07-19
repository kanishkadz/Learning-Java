import java.util.Scanner;

public class Program3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int s1,s2,s3,s4,s5;
        float percentage;
        System.out.print("Enter marks of 5 subjects:");
        s1 = input.nextInt();
        s2 = input.nextInt();
        s3 = input.nextInt();
        s4 = input.nextInt();
        s5 = input.nextInt();
        percentage=(s1+s2+s3+s4+s5)/5;
        System.out.print("Percentage is "+percentage);
    }
}