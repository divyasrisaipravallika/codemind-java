import java.util.Scanner;
public class v
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        if(e==1 || e==11 || e==12)
        {
           System.out.println("Winter");
        }
        else if(e==2 || e==3)
        {
           System.out.println("Spring");
        }
        else if(e==4 || e==5 || e==6)
        {
           System.out.println("Summer");
        }
        else if(e==7 || e==8|| e==9)
        {
           System.out.println("Rainy");
        }
        else
        {
           System.out.println("-1");
        }
    }
}