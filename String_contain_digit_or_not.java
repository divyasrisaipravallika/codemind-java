import java.util.*;
public class FindUnique{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       
        
          int flag = 0,c=0;
            String s = sc.nextLine();
            String o = "0123456789";
            for(int i = 0 ; i < s.length() ; i++)
            {
                if(o.contains(""+s.charAt(i)))
                {
                   
                    flag = 1;
                    c++;
                    
                }
            }
            if(flag==0) System.out.println("Doesn't contain digit");
        else  System.out.println("Contains "+c+" digit");
        
    }
}