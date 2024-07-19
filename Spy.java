import java.util.Scanner;
class Spy{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n, sum=0, pro=1, r=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(int i=n; i>0; i/=10){
            r=i%10;
            sum=sum+r;
            pro=pro*r;
        }
        if(sum==pro)
            System.out.println("Spy number !!");
        else
            System.out.println("Not a Spy number !!");
    }
}