import java.util.Scanner;
public class con
{
    public static void main(String[] args)
    {
       int a;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       String s=Integer.toString(a);
       int c = Integer.parseInt(s,8);
       System.out.println(c);
    }
}