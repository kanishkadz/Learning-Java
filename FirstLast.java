import java.util.Scanner;
class FirstLast{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        int A[] = new int[size];
        if(size%2!=0)
            System.exit(0);
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
            A[i]=sc.nextInt();
        for(int i=0;i<size/2;i++){
            int temp = A[i];
            A[i] = A[size-1-i];
            A[size-1-i] = temp;
        }
        System.out.println("New Array:");
        for(int i=0;i<size;i++)
            System.out.println(A[i]);
    }    
}