import java.util.Scanner;

class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("-: M E N U :-");
        System.out.println("1 -> Positive/Negative");
        System.out.println("2 -> Even/Odd");
        System.out.print("Enter your choice:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println((n > 0) ? "Positive !!" : "Negative !!");
                break;
            case 2:
                System.out.println((n % 2 == 0) ? "Even !!" : "Odd !!");
                break;
            default:
                System.out.println("Wrong Choice !!");
        }
    }
}
