import java.util.Scanner;
class Arev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int i=0, j, rev, r, no;
        System.out.println("Enter "+n+" elements:");
        while(i<n){
            no = sc.nextInt();
            if(no>9){
                A[i] = no;
                i++;
            } 
            else {
                System.out.println("Value must be greater than 9");
            }
        }
        for(i=0; i<n; i++){
            rev = 0;
            for(j=A[i]; j>0; j/=10){
                r = j%10;
                rev = rev*10+r; 
            }
            B[i] = rev;
        }
        System.out.println("REsultant Array is :");
        for(i=0; i<n; i++){
            System.out.println(B[i]);
        }
    }
}