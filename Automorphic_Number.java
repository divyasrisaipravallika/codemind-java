import java.util.*;
public class F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n*n;
        String a = Integer.toString(n);
        String b = Integer.toString(m);
        System.out.println(b.endsWith(a) ? "Automorphic Number" : "Not an Automorphic Number");
    }
}