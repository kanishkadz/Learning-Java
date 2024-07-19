import java.util.Scanner;
class Largest{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.:");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd no.:");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd no.:");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
            System.out.println(n1+" is largest !!");
        else if(n2>n1 && n2>n3)
            System.out.println(n2+" is largest !!");
        else
            System.out.println(n3+" is largest !!");
    }
}