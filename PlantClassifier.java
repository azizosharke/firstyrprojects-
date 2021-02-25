
/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names? Yes
       Mark out of 10:   10 
       Comment: I used meaningful variable so the person can understand the code 
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:  5 
       Comment:  yes I used the lowerCamelCase structure
   3. Did I indent the code appropriately?
       Mark out of 15:   15
       Comment: yes I did do everything as Stated 
      Total Mark out of  30 (Add all the previous marks):  30/ 30 
*/









import java.util.Scanner;

public class PlantClassifier {

	public static void main(String[] args) {
		
	Scanner input = new Scanner( System.in );
	
	System.out.print("Does the plant have cells and tissues which are organised into functional structures (Yes/No)?");
	
	
	String hasOrganizedAnswer = input.next();
	
	
	boolean hasOrganized = hasOrganizedAnswer.equalsIgnoreCase("Yes");
	
	if (!hasOrganized)                                                           // They are not organized 
		
		
	{
		System.out.print(" The plant is an AlGAE. ");
		
	}
	
	else 
		
	{
		System.out.print( "Does the plant have vascular tissues (Yes/No)?");     
		
		String hasVascularAnswer = input.next();
		
		boolean hasVascular = hasVascularAnswer.equalsIgnoreCase("Yes");
		
		if (!hasVascular)                                                          // Doesn't have vascular tissues 
			
		{
			System.out.print("The plant is a BRYOPHYTE. " );
		}
		
		else 
			
		{
			
			System.out.print ("Is the plant dispersed by seeds (Yes/No)?") ; 
			
			String hasDispersedAnswer = input.next();
			
			boolean hasDispersed = hasDispersedAnswer .equalsIgnoreCase("Yes");
			 
			if (!hasDispersed)                                                          // Does't dispered by seeds 
				
				
			                                                                            
				
			{ 
				System.out.println("The plant is a PTERIDOPHYTE. ");                    // But disperesed by spores 
				
				
			}
			
			else 
				
			{
				
				System.out.print( "Are the seeds enclosed (Yes/No)?" ) ;                 
				
				
				String hasEnclosedSeedsAnswer = input.next();
				
				boolean hasEnclosedSeeds= hasEnclosedSeedsAnswer.equalsIgnoreCase("Yes"); 
				
				
				if ( hasEnclosedSeeds )                      
					
				{
					System.out.print(" The plant is an ANGIOSPERM. ");                                   // Has enclosed seeds 
				}
					
				else System.out.print(" The plant is a GYMNOSPERM. " );                                 // Doesnt have eclosed seeds 
				
				
				input.close(); 

					
				}
				
			}
			
			
		}
	} 
	

	}


