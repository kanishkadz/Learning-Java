import java.io.*;
class ReverseChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
        char c = sc.next().charAt(0);
        int len = c.length();
        for(int i=len-1; i>=0; i--)
            System.out.print(c.charAt(i));
    }
}