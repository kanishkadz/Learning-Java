import java.util.Scanner;
class Vertical{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r , rev=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(int i =n; i>0; i/=10){
            r=i%10;
            rev=rev*10+r;
        }
        for(int j = rev; j>0; j/=10){
            r=j%10;
            System.out.println(r);
    }
}