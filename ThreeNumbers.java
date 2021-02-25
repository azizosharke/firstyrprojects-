/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5: 5
       Comment: yes i made it easier to understand
         2. Did I indent the code appropriately?
       Mark out of 5: 5
       Comment: yes i did
   3. Did I make use of the functions appropriately within main and the other functions?
       Mark out of 10: 10
       Comment: yes i did
       Total Mark out of  20 (Add all the previous marks): 20
*/
import java.util.Scanner;
public class ThreeNumbers
{
    private static final double THREE_DIVISOR = 3;                     // declaring constant for later use
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("(\\p{javaWhitespace})+");
        System.out.print("Please enter your three integers separated by spaces (or enter 'quit'): ");
        while (input.hasNextInt())
        {
            int firstInteger = input.nextInt();
            int secondInteger = input.nextInt();
            int thirdInteger = input.nextInt();
            long median = medianOf(firstInteger,secondInteger, thirdInteger);
            long amountOfValuesGreaterThanAvg = countOfNumbersGreaterThanTheAverage(firstInteger, secondInteger
                    ,thirdInteger);
            String finalMessage = getFormattedOutputString((int) median, (int) amountOfValuesGreaterThanAvg);
            System.out.println(finalMessage);
            System.out.print("Please enter your three integers separated by spaces (or enter 'quit'): ");
        }
        input.hasNext("quit");
    }
    public static int medianOf(int first, int second, int third)
    {
        if (first <= second)
        {
            if (second <= third)
            {
                return second;
            } else return Math.max(first, third);                // if first <= third ,return third
        } else
            {                                                 // else return to first
            if (first <= third)
            {
                return first;
            }                                                    // if first second <= third , return third
            else return Math.max(second, third);                 // else if return to second
        }
    }
    public static double averageOf(double first, double second, double third)
    {
        return ((first + second + third) / THREE_DIVISOR);
    }

    public static int countOfNumbersGreaterThanTheAverage(int first, int second, int third)
    {
        int answer = 0;
        double average = averageOf(first, second, third);
        if (first > average)
        {
            answer++;
        }
        if (second > average)
        {
            answer++;
        }
        if (third > average)
        {
            answer++;
        }
        return answer;
    }
    public static String getFormattedOutputString(int median,int countOfNumbersGreaterThanTheAverage)
    {
        if (countOfNumbersGreaterThanTheAverage <= 1)
        {
            return ("The median of your numbers is " + median + ", and " + countOfNumbersGreaterThanTheAverage +
                    " of them is greater than their average.");

        } else
            {
            return ("The median of your numbers is " + median + ", and " + countOfNumbersGreaterThanTheAverage
                    + " of them are greater than their average.");
            }
    }
}



