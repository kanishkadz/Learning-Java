import java.util.Scanner;
class EvenDig{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        int i, rev=0;
        for(i=n; i!=0; i/=10){
            rev=rev*10+i%10;
        }
        for(i=rev; i>0; i/=10){
            if((i%10)%2==1)
                System.out.print(i%10);
        }
        for(i=rev; i>0; i/=10){
            if((i%10)%2==0)
                System.out.print(i%10);
        }
    }
}