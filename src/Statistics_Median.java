import java.util.Arrays;

public class Statistics_Median {
    public static void main(String[] args) {
        int MyNum[] = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate and print the median
        double median = calculateMedian(MyNum);
        System.out.println("Median: " + median);
    }

    // Method to calculate the median
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr); // Sort the array
        int length = arr.length;
        if (length % 2 == 0) {
            // If even, average of two middle elements
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            // If odd, the middle element
            return arr[length / 2];
        }
    }
}