import java.util.Scanner;
class Row{
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
        //sum
        for(i=0;i<r;i++){
            int sum = 0;
            for(j=0;j<c;j++){
                System.out.print(A[i][j]+"\t");
                sum = sum + A[i][j];
            }
            System.out.println("\t = "+sum);
        } 
    }
}