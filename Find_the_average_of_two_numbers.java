import java.util.Scanner;
public class avg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%.4f",(a+b)/2);
    }
}