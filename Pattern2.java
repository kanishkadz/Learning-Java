import java.util.Scanner;
class Pattern2{
    public static void main(String Args[]){
        int i,j;
        for(i=5; i>=1; i--){
            for(j=1; j<=5-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}