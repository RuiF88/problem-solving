/*
Given an array of integers and a number k, count the number of contiguous subarrays of size k whose sum is greater
than or equal to a target s.
 */
public class SlidingWindowDynamic {
    int[] arr = new int[]{2, 1, 5, 1, 3, 2};
    int k = 3;
    int s = 8;
    int expectedOutput= 2;

    public void calculate(){
    int sum =0;
    int numberOfSubArrays = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(i>=k){
                sum -= arr[i-k];
            }

            if(i>=k-1 && sum>=s){
                numberOfSubArrays++;
            }

        }

        if(numberOfSubArrays!= expectedOutput){
            throw new RuntimeException("Bad Result");
        }

    }
}
