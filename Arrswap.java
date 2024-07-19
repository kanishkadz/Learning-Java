import java.util.Scanner;
class Arrswap {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);    
    System.out.print("Enter size:");
    int size = sc.nextInt();
    if(size%2!=0){
        System.exit(0);
    }
    int A[] = new int[size];
    System.out.print("Enter elements:");
    for(int i=0; i<size; i++){
        A[i] = sc.nextInt();
    }
    for(int i=0; i<size; i=i+2){
        int temp = A[i];
        A[i] = A[i+1];
        A[i+1] = temp;
    }
    System.out.println("Resultant array is:");
    for(int i =0; i<size; i++){
        System.out.println(A[i]);
    }
}
