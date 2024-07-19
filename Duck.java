import java.util.Scanner;
public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, flag=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(int i=n; i>0; i/=10){
            r=i%10;
            if(r==0){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Duck number !!");
        else
            System.out.println("Not a Duck number !!");
    }    
}
