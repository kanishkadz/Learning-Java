import java.util.Scanner;
class Total{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int i, n, total=0;
        for(i=0; i<5; i++){
            System.out.print("Enter a number:");
            n = sc.nextInt();
            total = total + n;
        }
        System.out.println("Sum is "+total);
    }
}