/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5:   5
       Comment:  yes I did
    2. Is my code easy to follow/understand?
       Mark out of 5:   5
       Comment: yes i did
   3. Did I use the functions as required?
       Mark out of 10:   10
       Comment: yes i did
       Total Mark out of  20 (Add all the previous marks):
*/
import java.util.Scanner;
public class PerniciousNumbers {
    private static final double TWO_PRIME = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum number you want to consider: ");
        int firstInteger = input.nextInt();

        int number = 0 ;
        while ( number <= firstInteger )
        {
            if ( isPernicious(number))
            {
                System.out.println(number + " is a pernicious number as it contains " + countBinaryOnes(number) +
                        " ones in it's binary representation ("+ getBinaryString(number) + ")");
            }
            number++ ;
        }
    }
    public static String getBinaryString(int firstInteger)
    {
        if (firstInteger < 0)
        {
           return ("-" + Integer.toBinaryString(Math.abs(firstInteger))) ;
        }
        else
        {
            return  Integer.toBinaryString(Math.abs(firstInteger));
        }
    }
    public static boolean isPrime(int firstInteger)
    {
        if (firstInteger < TWO_PRIME)
        {
            return false;
        }
        for (int number = (int) TWO_PRIME; number < firstInteger; number++)
        {
            if (firstInteger % number == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int countBinaryOnes(int firstInteger)
    {
        return Integer.bitCount(Math.abs(-firstInteger));
    }
    public static boolean isPernicious(int firstInteger)
    {
        boolean isPernicious = false ;
        if (isPrime(countBinaryOnes(firstInteger)))
        {
            isPernicious = true ;
        }
        return isPernicious;
    }

}


