import java.util.Scanner;
public class Convert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sec;
        sec = sc.nextInt();
        int t,r,i;
        t=sec/3600;
        r=(sec%3600)/60;
        i=(sec%3600)%60;
        System.out.printf("H:M:S-%d:%d:%d",t,r,i);
    }
}