import java.util.Scanner;
class AscCol{
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
        for(j=0; j<r; j++){
            for(i=0; i<r-1; i++){
                for(int k=0; k<r-i-1; k++){
                    if(A[k][j]>A[k+1][j]){
                        int temp = A[k][j];
                        A[k][j] = A[k+1][j];
                        A[k+1][j] = temp;
                    }
                }
            }
        }
        //printing
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        } 
    }
}