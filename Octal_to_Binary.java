import java.util.Scanner;
public class can
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test!=0)
        {
            int a;
            a = sc.nextInt();
            String b = Integer.toString(a);
            int c = Integer.parseInt(b,8);
            System.out.println(Integer.toString(c,2));
            test-=1;
        }
     }

}