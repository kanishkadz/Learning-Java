import java.util.Scanner;
class DigitArr{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for(i=0; i<10; i++){
            for(j=n; j>0; j/=10){
                if(i==j%10)
                    System.out.print(i);
            }
        }
    }
}