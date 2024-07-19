import java.util.Scanner;
class Palindrome{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n, d, r, rev=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        d=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==d)
            System.out.println("Palindrome number !!");
        else
            System.out.println("Not Palindrome number !!");
    }
}