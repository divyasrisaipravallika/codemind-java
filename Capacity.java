import java.util.Scanner;
public class cap
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int t,s,b;
       t = sc.nextInt();
       s = sc.nextInt();
       b = sc.nextInt();
       System.out.println((2*t*s*b)/2+" KB");
    }
}