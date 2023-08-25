import java.util.Scanner;
public class iterate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i , j;
        n = sc.nextInt();
        int[] a = new int[n-1];
        for(i = 0 ; i < n-1; i++)
        {
            a[i] = sc.nextInt();
        }
        int N = a.length;
       int[] temp = new int[N + 1];
     
        for ( i = 0; i < N; i++) {
          temp[a[i] - 1] = 1;
        }
     
        int ans = 0;
        for ( i = 0; i <= N; i++) {
          if (temp[i] == 0)
            ans = i + 1;
        }
        System.out.println(ans);
    }
}