/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use appropriate CONSTANTS instead of numbers within the code? yes 
       Mark out of 5:    
       Comment:
   2. Did I use easy-to-understand, meaningful CONSTANT names? yes 
       Mark out of 5:   
       Comment: 
        3. Did I format the CONSTANT names properly (in UPPERCASE)?yes 
       Mark out of 5:   
       Comment: 
   4. Did I use easy-to-understand meaningful variable names? yes 
       Mark out of 10:   
       Comment: 
   5. Did I format the variable names properly (in lowerCamelCase)?yes 
       Mark out of 5:   
       Comment: 
   6. Did I indent the code appropriately? yes 
       Mark out of 10:   
       Comment: 
     Total Mark out of  40 (Add all the previous marks):  
*/




import java.util.Scanner;

public class LoanRepaymentCalculator {

	public static void main(String[] args) {
	
		System.out.print("Enter loan amount? ");                                // loan amount 
		Scanner input = new Scanner( System.in )  ; 
		double loanAmount = input.nextDouble();
		
		
		System.out.print("Enter annual interest rate? (e.g. 0.04) ");           // interest rate 
		double annualInterestRate = input.nextDouble();
		
		
		System.out.print("Enter the term of the loan in years? ");              // loan in years 
		
        final int MONTHS_IN_YEAR =12;                                           // making a CONSTANT 
		
		int loanInYears =  input.nextInt();
		
        
		input.close();                                                         // closing the input 
		
		

		
		
		int loanInMonths = loanInYears*MONTHS_IN_YEAR ;                        // converting formula years to months 
		
		
		
		
		
		double monthlyInterestRate =  (annualInterestRate/MONTHS_IN_YEAR);        // interest rate conversion   
		
		
		double monthlyRepayment = loanAmount * ((monthlyInterestRate  * (Math.pow(1 + monthlyInterestRate , loanInMonths)))  
				
				/ ((Math.pow(1 + monthlyInterestRate , loanInMonths)) -1 ));             // formula for the loan 
		
		
		
		System.out.printf("The monthly repayment for a %d year loan of %.2f at an annual interest rate of %.2f would be %.2f  " 
				
				, loanInYears, loanAmount, annualInterestRate, monthlyRepayment);               // the output 

	}

} 
                                                                                                // finally done :) 
