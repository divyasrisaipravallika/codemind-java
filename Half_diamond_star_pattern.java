import java.util.Scanner;
public class D
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int i , j;
       if(n>=3 && n<=100)
       {
           for(i=1 ; i<=n ; i++)
           {
               for(j=1 ; j<=i ; j++)
               {
                   System.out.printf("*");
               }
               System.out.println();
           }
           for(i=n-1; i>=1 ; i--)
           {
               for(j = i ; j>=1 ; j--)
               {
                   System.out.printf("*");
               }
               System.out.println();
           }
       }
       else
       {
           System.out.print("The pattern is not possible");
       }
    }
}