import java.util.Scanner;
public class GradeComputation {
    public static final String[] MODULE_CODES   = { "CSU11001", "CSU11010", "CSU11013", "CSU11021", "CSU11022",
            "CSU11026", "CSU11031", "CSU11081", "CSU12002", "STU11002" };
    public static final int[] MODULE_CREDITS = {  5,          10,         5,          5,          5,          10,
            5,          5,          5,          5         };
    public static final int MINIMUM_grades = 40;

    public static void main(String[] args) {
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the first year grade assessor.\n");
        while (!quit)
        {
            int count = 0;
            double[] grades = new double[0];
            while (count < MODULE_CODES.length && !quit)
            {
                System.out.print("Enter the student mark for " + MODULE_CODES[count]
                        + " (or enter quit): ");
                if (input.hasNextDouble())
                {
                    double[] tempGrades = new double[grades.length + 1];
                    System.arraycopy(grades, 0, tempGrades, 0, grades.length);
                    grades = tempGrades;
                    grades[count++] = input.nextDouble();
                } else if (input.hasNext("quit"))
                {
                    quit = true;

                } else
                    {
                    System.out.print("Error - Enter a number between 0.0 and 100.0 or quit.\n");
                    input.next();
                }
            }
            if (!quit) {

                int averageMark = (int) Math.round(weightedAverageMark(grades));
                System.out.println("Result = " + determineOverallGrade(grades) + " with an overall mark of " +
                        String.format("%d", averageMark) + "%." + " \n" + " " +
                        (determineOverallGrade(grades).equals("FAIL")
                        ? creditsBelowSpecifiedMark(grades, MINIMUM_grades) + " credits were failed." : ""));
                System.out.println();
            }
        }
    }
    public static int creditsBelowSpecifiedMark( double[] grades, int specifiedMinimumMark )
    {
            int credits = 0;
            for (int count = 0; count < grades.length; count++)
            {
                if (Math.round(grades[count]) < specifiedMinimumMark)
                    credits = credits + MODULE_CREDITS[count];
            }
            return Math.round(credits);
        }
        public static double weightedAverageMark( double[] grades )
        {
            double totalCredits = 0;
            double totalMark = 0;
            for (int moduleCredit : MODULE_CREDITS)
            {
                totalCredits = totalCredits + moduleCredit;
            }
            for (int count = 0; count < grades.length; count++)
            {
                totalMark = totalMark + grades[count] * (MODULE_CREDITS[count]);
            }

            return ( totalMark / totalCredits);
        }
public static String determineOverallGrade( double[] grades )
{
        double overallGrade = Math.round(weightedAverageMark(grades));
        String gradeString = " ";
        boolean fail = false ;
        int creditFailed = creditsBelowSpecifiedMark(grades,MINIMUM_grades) ;
        for ( int count = 0 ; count < grades.length && !fail; count++)
        {
            if (Math.round(grades[count]) < 35 )
            {
               fail = true ;
            }
            if (creditFailed <=10 && overallGrade >= MINIMUM_grades) {
                if (overallGrade >= 70) {
                    gradeString = "I";
                } else if (overallGrade >= 60) {
                    gradeString = "II.1";
                } else if (overallGrade >= 50) {
                    gradeString = "II.2";
                } else if (overallGrade >= 40) {
                    gradeString = "III";
                }
            }
            else
                {
                gradeString = "FAIL";
            }
        }
        if ( fail )
            gradeString ="FAIL" ;

    return gradeString;
}
}












