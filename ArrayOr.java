import java.util.Scanner;
class ArrayOr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        int A[] = new int[size];
        if(size%2!=0)
            System.exit(0);
        System.out.println("Enter the element:");
        for(int i=0;i<size;i++)
            A[i] = sc.nextInt();
        for(int i=0;i<size/2-1;i++){
            for(int j=0;j<size/2-1-i;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for(int i=size/2;i<size/2-1;i++){
            for(int j=size/2;j<size/2-1-i;j++){
                if(A[j]<A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
     
        }
        System.out.println("Resultant Array:");
        for(int i=0;i<size;i++)
            System.out.print(A[i]+" ");
    }
}
