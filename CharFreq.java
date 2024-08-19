import java.util.Scanner;

class CharFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        String input = sc.next(); 
        int len = input.length(); 
        int words, upper, lower;
        for(int i=0; i<len; i++){
            if(input.isWhiteSpace(input.charAt(i)))
                words++;
            else if(input.isUpperCase(input.charAt(i)))
                upper++;
            else if(input.isLowerCase(input.charAt(i)))
                lower++;
        }
        System.out.println("No of words is :"+words);
        System.out.println("Upper Case:"+upper);
        System.out.println("Lower Case:"+lower);
    }
}
