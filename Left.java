import java.util.Scanner;
class Left{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        int A[] = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            A[i] = sc.nextInt();
        }
        for(int j=0; j<size;j++){
            if(i==size-1)
                A[0]=A[size-1];
            else{
                A[i+1]=A[i]
            }
        }
    }
}