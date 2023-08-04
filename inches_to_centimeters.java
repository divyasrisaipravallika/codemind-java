import java.util.Scanner; 
import java.math.BigDecimal;
import java.math.RoundingMode;
public class centi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int inc;
        inc=sc.nextInt();
        double number=inc*2.54;
        BigDecimal bigDecimalFloat = new BigDecimal(number);
        BigDecimal big = bigDecimalFloat.setScale(2, RoundingMode.HALF_UP);
        System.out.println(big);
    }
}