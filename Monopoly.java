import java.util.Scanner;
public class mono
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test!=0)
        {
            int camp1 = sc.nextInt();
            int camp2 = sc.nextInt();
            int camp3 = sc.nextInt();
            if (camp1 > camp2+camp3 || camp3 > camp2+camp1 || camp2 > camp1+camp3)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
          test=test-1;
        }
    }
}