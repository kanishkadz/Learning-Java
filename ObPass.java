import java.util.Scanner;
class Room{
    int len;
    int brd;
    void setRoom(int len, int brd){
        this.len = len;
        this.brd = brd;
    }
    public void calRoom(Room x, Room y){
        len = x.len + y.len;
        brd = x.brd + y.brd;
        System.out.println("Total length = "+len);
        System.out.println("Total breadth = "+brd);
    }
    void showRoom(){
        System.out.println("Length = "+len);
        System.out.println("Breadth = "+brd);
    }
}

class ObPass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room R1 = new Room();
        System.out.print("Enter length and breadth for Room 1");
        int l1 = sc.nextInt();
        int b1 = sc.nextInt();
        R1.setRoom(l1, b1);
        R1.showRoom();
        Room R2 = new Room();
        System.out.print("Enter length and breadth for Room 2");
        int l2 = sc.nextInt();
        int b2 = sc.nextInt();
        R2.setRoom(l2, b2);
        R2.showRoom();
        Room R3 = new Room();
        R3.calRoom(R1, R2);
    }
}