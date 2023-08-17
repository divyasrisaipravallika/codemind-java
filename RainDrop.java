import java.util.Scanner;
public class D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int s=0;
        if (c%3==0) 
        {
            System.out.printf("Pling");
            s++;
        }
        if (c%5==0) 
        {
            System.out.printf("Plang");
            s++;
        }
      if (c%7==0) 
        {
            System.out.printf("Plong");
            s++;
        }
        if(s==0){
            System.out.printf("%d",c);
        }
    }
}