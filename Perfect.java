import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact=0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0)
                    fact=fact+i;
        }
        if(fact==n)
            System.out.println("Perfect Number !!");
        else
            System.out.println("Not a Perfect Number !!");
    }    
}