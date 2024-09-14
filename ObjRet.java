import java.util.Scanner;
class Room{
    int len, brd;
    void setRoom(int len, int brd){
        this.len = len;
        this.brd = brd;
    }
    public Room calRoom(Room x, Room y){
        Room tab = new Room();
        tab.len = x.len + y.len;
        tab.brd = x.brd + y.brd;
        return tab;
    }
    void showRoom(){
        System.out.println("Length = "+len);
        System.out.println("Breadth = "+brd);
    }
}
class ObjRet {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Room r1 = new Room();
    System.out.print("Enter length & breadth for Room 1:");
    int l1 = sc.nextInt();
    int b1 = sc.nextInt();
    r1.setRoom(l1, b1);
    r1.showRoom();
    Room r2 = new Room();
    System.out.print("Enter length & breadth for Room 2:");
    int l2 = sc.nextInt();
    int b2 = sc.nextInt();
    r1.setRoom(l1, b1);
    r1.showRoom();
    Room r3 = new Room();
    System.out.print("Enter length & breadth for Room 3:");
    int l3 = sc.nextInt();
    int b3 = sc.nextInt();
    r1.setRoom(l1, b1);
    r1.showRoom();
   }
}
