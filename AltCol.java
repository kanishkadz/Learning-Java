import java.util.Scanner;
class AltCol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int r = sc.nextInt();
        System.out.print("Enter column:");
        int c = sc.nextInt();
        int i,j;
        int A[][] = new int[r][c];
        System.out.print("Enter "+r+"x"+c+" elemnts:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                A[i][j] = sc.nextInt();
            }
        }
        //logic
        for(i=0;i<r;i=i+2){
            for(j=0;j<c;j=j+2){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        } 
    }
}