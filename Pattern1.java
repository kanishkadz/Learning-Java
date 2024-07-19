import java.util.Scanner;
class Pattern1{
    public static void main(String Args[]){
        int i,j;
        for(i=1; i<=5; i++){
            for(j=i; j<=i+4; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
