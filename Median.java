import java.util.Arrays;
import java.util.Scanner;
public class Median {
    private static final double THREE_NUMBER = 3;
    private static final double TWO_NUMBER = 2;
    private static final double ONE_NUMBER = 1;
    private static final double ZERO_NUMBER = 0;

    public static void main(String[] args) {
        System.out.print("Welcome to the median & rolling average system.\n");
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        double[] array = {};
        int randomEnters = (int) THREE_NUMBER;
        do {
            System.out.print("Enter a number (or enter quit): ");
            if (input.hasNextDouble()) {
                double[] tempArray = new double[(int) (array.length + ONE_NUMBER)];
                System.arraycopy(array, (int) ZERO_NUMBER, tempArray, (int) ZERO_NUMBER, array.length);
                tempArray[(int) (tempArray.length - ONE_NUMBER)] = input.nextDouble();
                array = tempArray;
                double averageOfValues = computeRollingAverage(array, randomEnters);
                String arrayString = convertToString(array);
                double medianOfValues = computeMedian(array);
                System.out.printf("The median of %s is %.1f and the " +
                                "rolling average of the last %d values is %.1f.\n"
                        , arrayString, medianOfValues, randomEnters, averageOfValues);
            } else if (input.hasNext("quit")) {
                quit = true;
            } else {
                System.out.print("Error - Enter any real number or quit.\n");
                input.next();
            }
        }
        while (!quit);
        input.close();
    }
    public static String convertToString(double[] array) {
        StringBuilder stringArray = new StringBuilder("{ ");
        if (array != null) {
            for (int count = (int) ZERO_NUMBER; count < array.length; count++) {
                stringArray.append(String.format("%.1f", array[count]));
                if ((array.length > ONE_NUMBER) && (array.length - count != ONE_NUMBER)) {
                    stringArray.append(", ");
                }
            }
            stringArray.append(" }");
            return stringArray.toString();
        } else {
            return "{ }";
        }
    }
    public static double computeMedian(double[] unsortedArray)
    {
        double medianOfValues;
        if (unsortedArray != null) {
            double[] sortedArray = createSortedArray(unsortedArray);
            int lengthOfArray = sortedArray.length;
            int valueOne;
            int valueTwo;

            if (sortedArray.length % TWO_NUMBER == ZERO_NUMBER) {
                valueOne = (int) ((lengthOfArray / TWO_NUMBER) - ONE_NUMBER);
                valueTwo = (int) (valueOne + ONE_NUMBER);
                medianOfValues = (sortedArray[valueOne] + sortedArray[valueTwo]) / TWO_NUMBER;
            } else {
                valueOne = (int) (sortedArray.length / TWO_NUMBER);
                medianOfValues = sortedArray[Math.round(valueOne)];
            }
            return medianOfValues;
        } else {
            return ZERO_NUMBER;
        }
    }
    public static double computeRollingAverage(double[] array, int randomEnters) {
        double averageOfValues;
        if (array != null) {
            double sumOfArray = ZERO_NUMBER;
            int count;
            if (randomEnters == ZERO_NUMBER) {
                return ZERO_NUMBER;
            } else if (array.length <= randomEnters) {
                for (count = (int) ZERO_NUMBER; count < array.length; count++) {
                    sumOfArray += array[count];
                }
                averageOfValues = sumOfArray / array.length;
            } else {
                for (count = (array.length - randomEnters); count < array.length; count++) {
                    sumOfArray += array[count];
                }
                averageOfValues = (sumOfArray / randomEnters);
            }
            return averageOfValues;
        } else {
            return ZERO_NUMBER;
        }
    }

    public static double[] createSortedArray(double[] array) {
        if (array != null) {
            double[] sortedArray = Arrays.copyOf(array, array.length);
            for (int count = (int) ZERO_NUMBER; count < sortedArray.length - ONE_NUMBER; count++) {
                int minimumCount = count;
                for (int countB = (int) (count + ONE_NUMBER); countB < sortedArray.length; countB++) {
                    if (sortedArray[countB] < sortedArray[minimumCount])
                        minimumCount = countB;
                }
                double temp = sortedArray[count];
                sortedArray[count] = sortedArray[minimumCount];
                sortedArray[minimumCount] = temp;
            }
            return sortedArray;
        } else
            {
            return null;
            }
    }
}











