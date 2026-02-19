package algorithms;

public class SlidingWindowFixed {

    /*
     * Maximum Average Subarray
     * Given an integer array nums and an integer k, find the maximum average of any contiguous subarray of length k.
     * */
    public void calculateProblem1() throws RuntimeException {
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        double expectedOutput = 12.75;
        int sum = 0;
        double average = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (i >= k) {
                sum -= nums[i - k];
            }

            average = Math.max(average, (double) sum / k);
        }


        if (average != expectedOutput) {
            throw new RuntimeException("BadResult: " + average);
        }
    }

    /*
     * Count Subarrays of Size K
     * Given an array of integers and a number k, count the number of contiguous subarrays of size k whose sum is greater than or equal to a target S.
     */
    public void calculateProblem2() {
        int[] arr = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int s = 8;
        int expectedOutput = 2;
        int sum = 0;
        int numberOfSubArrays = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (i >= k) {
                sum -= arr[i - k];
            }

            if (i >= k - 1 && sum >= s) {
                numberOfSubArrays++;
            }

        }

        if (numberOfSubArrays != expectedOutput) {
            throw new RuntimeException("Bad Result");
        }

    }
}
