import java.util.Scanner;
class Even {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number !!");
        } else {
            System.out.println("Odd number !!");
        }        
    }
}
