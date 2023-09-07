import java.util.Scanner;
public class G{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0 , s = 0;
        for(int i = 1; i <= n ; i++)
        {
            if(n%i==0) c+=i;
        }
        for(int i = 1; i <= m ; i++)
        {
            if(m%i==0) s+=i;
        }
        System.out.println(c==s?"Amicable" : "Not Amicable");
    }
}