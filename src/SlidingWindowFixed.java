/*
 * Problem:
 * Given an integer array nums and an integer k, find the maximum average of any contiguous subarray of length k.
 * */
public class SlidingWindowFixed {
    int[] nums = new int[]{1,12,-5,-6,50,3};
    int k = 4;
    double expectedOutput = 12.75;

    public void calculate() throws RuntimeException{
        int sum = 0;
        double average = 0;

        for(int i=0; i<nums.length; i++){

            sum += nums[i];

            if(i>=k){
                sum -= nums[i-k];
            }

            average = Math.max(average, (double) sum/k);
        }


        if(average != expectedOutput){
            throw new RuntimeException("BadResult: "+average);
        }
    }
}
