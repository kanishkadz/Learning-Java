import java.util.Scanner;
public class Prime{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int ll, ul;
        boolean flag = false;
        System.out.print("Enter the lower limit:");
        ll = sc.nextInt();
        System.out.print("Enter the upper limit:");
        ul = sc.nextInt();
        for(int i=ll; i<=ul; i++){
            flag = false;
            for(int j=2; j<i/2; j++){
                if(i%j==0)
                    flag=true;
                    break;
            }
            if(flag==false)
                System.out.println(i);            
        }
    }
}