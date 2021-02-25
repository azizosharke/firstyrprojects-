/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 10:   10 
       Comment: yes i used 
   2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
       Mark out of 5:   5 
       Comment: yes
   3. Did I indent the code appropriately?
       Mark out of 10:   10 
       Comment: yes 
   4. Did I implement a for loop to read the input as required?
       Mark out of 10:   10 
       Comment: yes 
      Total Mark out of  35 (Add all the previous marks):  
*/








import java.util.Scanner; 
public class TotalAverageCalculator {

	public static void main(String[] args) {
		
		
		System.out.print( "How many integers do you want to enter? " );
		Scanner input = new Scanner( System.in );
		int integersAmount = input.nextInt();
		final int MAX_10 = 10 ;
		final int MIN_2 =  2 ;
				
		if ((integersAmount <= MAX_10 ) && (integersAmount >= MIN_2))
			
		{
			int sumOfIntegers = 0 ;
			double averageOfIntegers = 0 ;
			for (int integer = 1 ; ( integer <= integersAmount) ; integer++) 
				
			{
				System.out.print("Enter integer " + integer + ": ");
				int integersResult = input.nextInt();
				sumOfIntegers = integersResult + sumOfIntegers ;
				averageOfIntegers = (double)sumOfIntegers / (double)integersAmount ; 
			    if (integer == integersAmount) 
			    	
			    {
			    	System.out.printf("The sum of your integers is %d and the average is %.2f" , sumOfIntegers , averageOfIntegers  );
			    	
			    }
			    
			}
			
		}
		
		else 
			
		{
			System.out.print("Error: This program is constrained to only compute the total & average of between 2 & 10 integers.");
		}
	
		input.close();
		
		
		
		
		
		
		
			
		
		
		
		
		}
}
	