import java.util.Scanner;
public class d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int y=0;
        if(a>b)
        {
            System.out.println(-1);
        }
        else
        {
            int  k = 0;
            while(k<=c)
            {
                k+=b;
                c+=a;
                ++y;
            }
        }
        if(y!=0)
        {
            System.out.println(y);
        }
    }
}