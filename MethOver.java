import java.util.Scanner;

class Area {
    public void area(int a) {
        int b = a * a;
        System.out.println("Area of Square = " + b);
    }
    public void area(int a, int b) {
        int c = a * b;
        System.out.println("Area of Rectangle = " + c);
    }
    public void area(double base, double height) {
        double c = 0.5 * base * height;
        System.out.println("Area of Triangle = " + c);
    }
}

public class MethOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int sideSquare = sc.nextInt();
        System.out.print("Enter the length and breadth of the rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.print("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Area obj = new Area();
        obj.area(sideSquare);        
        obj.area(length, breadth);    
        obj.area(base, height);        
    }
}
