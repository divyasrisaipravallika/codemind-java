import java.util.Scanner;
public class v
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String h = sc.nextLine();
        int e = sc.nextInt();
        double b;
        if(e<=199)
        {
            b = e*1.20;
        }
        else if(e>=200 && e<400)
        {
            b = e*1.50;
        }
        else if(e>=400 && e<600)
        {
            b = e*1.80;
        }
        else 
        {
            b = e*2.00;
        }
        if(b<400)
        {
            System.out.printf("%.2f",b+100);
        }
        else
        {
            System.out.printf("%.2f",b+(b*0.15));
        }
    }
}