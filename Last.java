import java.util.Scanner;
class Last{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w1=0, w2=0,r,rev=0,sum=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        w1=n%10;
        for(int i=n; i>0; i/=10){
            r=i%10;
            rev=rev*10+r;
        }
        w2=rev%10;
        sum=w1+w2;
        System.out.println("Sum of first & last digit is "+sum);
    }
}