import java.util.Scanner;
class EvenSum {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int i, d, n, evs = 0, ods = 0;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        for (i = n; i > 0; i /= 10) {
            d = i % 10;
            if (d % 2 == 0)
                evs = evs + d;
            else
                ods = ods + d;
        }
        System.out.println("Even sum is " + evs);
        System.out.println("Odd sum is " + ods);
    }
}
