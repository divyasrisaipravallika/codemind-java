import java.util.*;
public class FindUnique{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int c = 0;
            for(int j = 0 ; j < n ; j++)
            {
                if(arr[i]==arr[j]) c++;
            }
            if(c<=1)
            {
                System.out.print(arr[i]+" ");
                flag = 1;
            }
        }
        if(flag == 0) System.out.print(-1);
    }
}