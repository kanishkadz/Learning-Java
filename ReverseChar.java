import java.util.Scanner;

class ReverseChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        String input = sc.next(); 
        int len = input.length(); 
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(input.charAt(i)); 
        }
        sc.close(); 
    }
}
