/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment: yes i did 
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: yes i did 
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: yes
   4. Did I implement a switch statement as required?
       Mark out of 10:   10
       Comment: yes i did
       Total Mark out of  25 (Add all the previous marks):  
*/
import java.util.Scanner;

public class Prizes {
    public static void main(String[] args) {
        final int MAX_NUMBER = 10;
        final int MIN_NUMBER = 1;
        System.out.print("This program tells competition participants what prize they have won. ");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        String placeHolder = "";
        int placePosition = 0;
        do {
            System.out.print(" \nEnter your place number (or type 'exit'): ");
            if (input.hasNextInt())
            {
                placePosition = input.nextInt();
                if ((placePosition >= MIN_NUMBER) && (placePosition <= MAX_NUMBER)) {
                    if (placePosition == 3) {
                        placeHolder = "rd";
                    } else if (placePosition == 2) {
                        placeHolder = "nd";
                    } else if (placePosition == 1) {
                        placeHolder = "st";
                    } else {
                        placeHolder = "th";
                    }
                    System.out.printf("You came in %d%s place and hence won ", placePosition, placeHolder);
                    switch (placePosition) {
                        case 1:
                            System.out.print("two theatre tickets + drinks during the interval " +
                                    "+ dinner before the show.");
                            break;
                        case 2:
                            System.out.print("two theatre tickets + drinks during the interval.");
                            break;
                        case 3:
                            System.out.print("two theatre tickets.");
                            break;
                        case 4:
                        case 5:
                            System.out.print("a 10 Euro book token.");
                            break;
                        default:
                            System.out.print("a 5 Euro book token.");
                            break;
                    }
                }
                if ((placePosition > MAX_NUMBER) || (placePosition < MIN_NUMBER))
                {

                    System.out.print("Sorry.  You did not win a prize.");
                }
            } else if (input.hasNext("exit"))
            {
                exit = true;
            } else
                {
                System.out.print("Sorry.  You did not win a prize.");
                input.next();
                }
        }
        while (!exit);
        input.close();

    }
}






