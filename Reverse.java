import java.util.Scanner;
class Reverse{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n, r, rev=0, i;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(i=n; i>0; i/=10){
            r=i%10;
            rev=rev*10+r;
        }
        System.out.println("Reverse of the number is "+rev);
    }
}