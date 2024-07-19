import java.util.Scanner;
class Parcel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in gram:");
        int w = sc.nextInt();
        if(w==100){
            System.out.println("Charge is 15.");
        } else {
            int w2 = w-1000;
            int r1=(w2/500)*8;
            int r = 15 + r1;
            System.out.println("Charges is "+r);
        }
    }
}