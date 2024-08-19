import java.util.Scanner;
class CharFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int len = input.length(); 
        int words = 0, upper = 0, lower = 0;
    
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c))
                words++;
            else if (Character.isUpperCase(c)) 
                upper++;
            else if (Character.isLowerCase(c))
                lower++;
        }
        if (len > 0) {
            words += 1;
        }
        System.out.println("No of words: " + words);
        System.out.println("Upper Case: " + upper);
        System.out.println("Lower Case: " + lower);
        sc.close();
    }
}
