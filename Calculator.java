import java.util.Scanner;
class Calculator{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int n2 = sc.nextInt();
        System.out.println("-: M E N U :-");
        System.out.println("1 --> Addition");
        System.out.println("2 --> Subtraction");
        System.out.println("3 --> Multiplication");
        System.out.println("4 --> Division");
        System.out.print("Enter your choice:");
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println(n1+n2);
        } else if(ch==2){
            System.out.println(n1-n2);
        } else if(ch==3){
            System.out.println(n1*n2);
        } else if(ch==4){
            System.out.println(n1/n2);
        }
    }
}