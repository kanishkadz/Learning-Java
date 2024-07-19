import java.io.*;
class First1{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer:");
        int i=Integer.parseInt(br.readLine());
        System.out.print("Enter Float:");
        float f=Float.parseFloat(br.readLine());
        System.out.print("Enter Double:");
        double d=Double.parseDouble(br.readLine());
        System.out.print("Enter Long:");
        long l=Long.parseLong(br.readLine());
        System.out.print("Enter String:");
        String s=br.readLine();
        System.out.print("Enter Character:");
        char c=(char)System.in.read();
        System.out.println("Integer value is "+i);
        System.out.println("Float value is "+f);
        System.out.println("Double value is "+d);
        System.out.println("Long value is "+l);
        System.out.println("String value is "+s);
        System.out.println("Character value is "+c);
    }
}