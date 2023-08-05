import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double v = r*r*3.14;
        System.out.printf("%.2f",v);
    }
}