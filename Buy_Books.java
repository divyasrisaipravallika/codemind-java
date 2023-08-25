import java.util.Scanner;
public class iterate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i , j , s=0, c=0;
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(i = 0 ; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(i = 0 ; i < n; i++)
        {
            b[i] = sc.nextInt();
        }
        for(i = 0 ; i < n ; i++)
        {
            s+=a[i];
            c+=b[i];
        }
        int d=c-s;
        if(d<0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(d);
        }

    }
}