import java.util.Scanner;
public class D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        int s = 0;
        while(t!=0)
        {
            int a = sc.nextInt();
            s+=a;
            t--;
        }
        System.out.println(s);
    }
}