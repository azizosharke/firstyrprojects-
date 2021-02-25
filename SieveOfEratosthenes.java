/* SELF ASSESSMENT
   1.    createSequence:
Did I use the correct method definition?
Mark out of 5: 5
Comment: yes
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5: 5
Comment: yes
Did I return the correct item?
Mark out of 5: 5
Comment: yes
   2.    crossOutMultiples
Did I use the correct method definition?
Mark out of 5: 5
Comment: yes
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2
Comment:yes
Did I loop through the array using the correct multiple?
Mark out of 5: 5
Comment: yes
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 3
Comment: yes
   3.    sieve
Did I have the correct function definition?
Mark out of 5: 5
Comment: yes
Did I make calls to other methods?
Mark out of 5: 5
Comment: yes
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2: 2
Comment: yes
   4.    sequenceTostring
Did I have the correct function definition?
Mark out of 5: 5
Comment: yes
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment:  yes
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets?
Mark out of 10: 10
Comment:    yes
   5.    nonCrossedOutSubseqToString
Did I have the correct function definition
Mark out of 5: 5
Comment:        yes
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: yes
Did I loop through the array updating the String variable with just the non-crossed out numbers?
Mark out of 5: 5
Comment: yes
   6.    main
Did I ask  the user for input n and handles input errors?
Mark out of 5: 5
Comments: yes
Did I make calls to other methods (at least one)?
Mark out of 5: 5
Comment:  yes
Did I print the output as shown in the question?
Mark out of 5: 5
Comment:   yes
   7.    Overall
Is my code indented correctly?
Mark out of 4: 4
Comments: yes
Do my variable names make sense?
Mark out of 4: 5
Comments: yes
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments: yes
      Total Mark out of 100 (Add all the previous marks):  100
*/
import java.util.Scanner;
public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter int >= 2: ");

        if (!inputScanner.hasNextInt()) {
            System.out.println("Something is wrong, Please try again.");
            inputScanner.next();
        }
        int integer = inputScanner.nextInt();
        int integerRounded = (int) Math.sqrt(integer);
        int[] sequenceNumbers = createSequence(integer);

        int z;
        for (z = 0; z <= integer - 2; z++) {
            if (z == integer - 2) {
                System.out.println(sequenceNumbers[z]);
            } else if (z < integer - 2)
                System.out.print(sequenceNumbers[z] + ",");
        }
        int[] firstSequence;
        int[] numberD = sieve(integer);
        int i = numberD.length - 1;
        while (i >= 0) {
            if (numberD[i] != 0 && numberD[i] <= integerRounded) {
                firstSequence = crossOutHigherMultiples(sequenceNumbers, numberD[i]);
                System.out.println(sequenceToString(firstSequence, integer));
            }
            i--;
        }
        System.out.println((nonCrossedOutSubseqToString(sieve(integer))));
    }

    public static int[] crossOutHigherMultiples(int[] integers, int integer)
    {
        if ( integer >= 0 && integers != null )
        {
            for (int z = 0; z < integers.length; z++)
            {
                if (integers[z] != integer && integers[z] % integer == 0)
                {
                    integers[z] = 0;
                }
            }
        }
        return integers;
    }
    public static int[] sieve(int numberA)
    {
        int[] array;
        int[] sequenceNumbers = createSequence(numberA);
        int numberC = (int) Math.sqrt(numberA);
        array = new int[numberA];
        for (int z = 2; z <= numberC; z++)
        {
            array = crossOutHigherMultiples(sequenceNumbers, z);
        }
        return array;
    }
    public static int[] createSequence(int numberE) {
        int[] primeNumbers;
        primeNumbers = new int[0];
        try {

            primeNumbers = new int[numberE - 1];
            for (int z = 0; z < primeNumbers.length; z++) {
                primeNumbers[z] = (z + 2);
            }
        }

        catch(Exception numberZeroOrLess){
                System.out.println("The number that was entered is <=0 , Try Again!");
            }
            return primeNumbers;

        }


    public static String sequenceToString(int[] array, int integer)
    {
        String sequenceString = " ";
        String emptyString = " ";

        if (array != null && integer != 0)
        {
            int[] sequenceNumbers = (createSequence(integer));
            for (int z = 0; z < sequenceNumbers.length; z++)
            {
                if (array[z] != 0 && z == sequenceNumbers.length - 1)
                {
                    sequenceString = Integer.toString(sequenceNumbers[z]);
                    sequenceString = emptyString + sequenceString;
                    emptyString = sequenceString;
                } else if (array[z] == 0 && z == sequenceNumbers.length - 1)
                {
                    sequenceString = "[" + sequenceNumbers[z] + "]";
                    sequenceString = emptyString + sequenceString;
                    emptyString = sequenceString;
                } else if (array[z] != 0 && z != sequenceNumbers.length - 1)
                {
                    sequenceString = Integer.toString(sequenceNumbers[z]);
                    sequenceString = emptyString + sequenceString + ",";
                    emptyString = sequenceString;
                } else if (array[z] == 0 && z != sequenceNumbers.length - 1)
                {
                    sequenceString = "[" + sequenceNumbers[z] + "]" + ",";
                    sequenceString = emptyString + sequenceString;
                    emptyString = sequenceString;
                }
            }
        }
        return sequenceString;
    }
    public static String nonCrossedOutSubseqToString(int[] arrayA)
    {
        String sequenceString = " ";
        if (arrayA != null) {
            int whileLoop = 0;
            {
                int z = 0;
                while (z < arrayA.length)
                {
                    if ((arrayA[z] == 0))
                    {
                        whileLoop++;
                    }
                    z++;
                }
            }
            int[] arrayTest = new int[arrayA.length - whileLoop];
            String arrayTestB = " ";
            int emptyArrayB = 0;
            int z = 0;
            while (z < arrayA.length)
            {
                if (arrayA[z] != 0 && emptyArrayB == arrayTest.length - 1)
                {
                    arrayTest[emptyArrayB] = arrayA[z];
                    sequenceString = arrayTest[emptyArrayB] + " ";
                    sequenceString = arrayTestB + sequenceString;
                    arrayTestB = sequenceString;
                    emptyArrayB++;
                } else if (arrayA[z] != 0 && emptyArrayB < arrayTest.length - 1)
                {
                    arrayTest[emptyArrayB] = arrayA[z];
                    sequenceString = arrayTest[emptyArrayB] + ",";
                    sequenceString = arrayTestB + sequenceString;
                    arrayTestB = sequenceString;
                    emptyArrayB++;
                }

                z++;
            }
        }
        return sequenceString;
    }
}
