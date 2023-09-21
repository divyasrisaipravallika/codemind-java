import java.util.*;
public class con
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = a+b;
        char[] p = c.toCharArray();
        Arrays.sort(p);
        System.out.println(new String(p));
    }
}