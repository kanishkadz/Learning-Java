import java.io.*;
class first {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter integer: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Integer value is " + i);
    }
}
