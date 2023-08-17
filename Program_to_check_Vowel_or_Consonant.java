import java.util.Scanner;
public class F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='A' || c=='a' || c=='E' || c=='e'|| c=='I'||   c=='O'    || c=='U' || c=='u' || c=='i')
        {
            System.out.println("Vowel");
        }
        else System.out.println("Consonant");
    }
}