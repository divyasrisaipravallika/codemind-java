import java.util.Scanner;
public class K
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1 ; i < n/2 ; i++)
        {
            if(i*(i+1) == n)
            {
                System.out.println("YES");
                c = 1;
            }
        }
        if(c==0) System.out.println("NO");
    }
}