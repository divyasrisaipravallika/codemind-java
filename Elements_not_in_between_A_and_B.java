import java.util.*;
public class D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[2];
        int s = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
         for(int i = 0 ; i < 2 ; i++)
        {
            b[i] = sc.nextInt();
        }
         for(int i = 0 ; i < n ; i++)
        {
            if(a[i] < b[0] || a[i] > b[1])
            {System.out.print(a[i]+" ");
                s=1;
            }
        }
        if(s==0) System.out.print(-1);
    }
}