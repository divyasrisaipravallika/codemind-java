import java.util.*;
public class FindUnique{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n!=0)
        { int flag = 0;
          String s = sc.nextLine();
          String a = "0123456789";
          for(int i = 0 ; i< s.length(); i++)
          {
              if((int)s.charAt(i)>=47 && (int)s.charAt(i)<=58)
              {
                    System.out.println("Yes");
                    flag = 1;
                    break;
              }
          }
          if(flag==0) System.out.println("No");
          n--;
        }
        
    }
}