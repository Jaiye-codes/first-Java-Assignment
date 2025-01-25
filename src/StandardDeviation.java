import java.util.Arrays;

public class StandardDeviation {
    public static void main(String[] args) {
        int MyNum[] = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate the mean
        double mean = calculateMean(MyNum);
        System.out.println("Mean: " + mean);

        // Calculate the standard deviation
        double stdDev = calculateStandardDeviation(MyNum, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] arr, double mean) {
        double sumSquaredDifferences = 0.0;
        for (int num : arr) {
            sumSquaredDifferences += Math.pow(num - mean, 2); // (x_i - μ)^2
        }
        return Math.sqrt(sumSquaredDifferences / arr.length); // √(∑(x_i - μ)^2 / N)
    }
}