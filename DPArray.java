import java.util.Scanner;
class DPArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int r = sc.nextInt();
        System.out.pritn("Enter column:");
        int c = sc.nextInt();
        int i,j;
        int A[][] = new int[r][c];
        System.out.print("Enter "+r+"x"+c+" elemnts:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(A[i][j]+"/t");
            }
            System.out.println();
        } 
    }
}