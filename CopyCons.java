import java.util.Scanner;
class Total{
    int a,b;
    Total(int a, int b){
        this.a=a;
        this.b=b;
    }
    Total(Total ob1, Total ob2){
        ob1.a = ob1.a + ob2.b;
        ob1.b = ob1.b + ob2.b;
    }
    public void showValues(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
class CopyCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Values for first object:");
        System.out.print("Enter values of a:");
        int a = sc.nextInt();
        System.out.print("Enter values of b:");
        int b = sc.nextInt();
        Total ob1 = new Total(a, b);
        ob1.showValues();
        System.out.println("Values for second object:");
        System.out.print("Enter values of a:");
        a = sc.nextInt();
        System.out.print("Enter values of b:");
        b = sc.nextInt();
        Total ob2 = new Total(a, b);
        ob2.showValues();
        Total ob3 = new Total(ob1, ob2);
    }    
}
