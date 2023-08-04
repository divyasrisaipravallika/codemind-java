import java.util.Scanner;
public class convert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day;
        day = sc.nextInt();
        int t,r,i;
        t = day/365;
        r = (day%365)/7;
        i = (day%365)%7;
        System.out.println(t);
        System.out.println(r);
    }
}