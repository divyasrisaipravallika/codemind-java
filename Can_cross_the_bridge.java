import java.util.Scanner;
public class CanCross
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int x,y,z;
       x = sc.nextInt();
       y = sc.nextInt();
       z = sc.nextInt();
       int n = (z-y)/x;
       System.out.println(n);
    }
}