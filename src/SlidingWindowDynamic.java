import java.util.HashSet;
import java.util.Set;

public class SlidingWindowDynamic {

    /*
     * Smallest Subarray With Sum ≥ S
     *
     * Given an array of positive integers and a positive integer S,
     * find the length of the smallest contiguous subarray whose sum is greater than or equal to S.
     * Return 0 if no such subarray exists.
     */
    public void calculateProblem1() {
        int[] arr = new int[]{2, 1, 5, 2, 3, 2};
        int s = 7;
        int expectedOutput = 2;

        int sum = 0;
        int minLenght = Integer.MAX_VALUE;
        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            while (sum >= s) {
                minLenght = Math.min(minLenght, i - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        if (minLenght != expectedOutput) {
            throw new RuntimeException("Bad Result: " + minLenght);
        }
    }

    /*
    Given a string, find the length of the longest substring without repeating characters.
    */
    public void calculateProblem2() {
        String originalString = "abcabcbb";
        int expectedOutput = 3;
        Set<Character> characterSet = new HashSet<>();
        int longest = 0;
        int left = 0;

        // O(n2) - bad performance
        /*
        for(int i=0; i<originalString.length(); i++){

            while (windowsString.contains(String.valueOf(originalString.charAt(i)))) {
                windowsString = windowsString.substring(1);
            }

            windowsString += originalString.charAt(i);

            longest = Math.max(longest, windowsString.length());

        }*/

        for(int right=0; right<originalString.length(); right++){

            while (characterSet.contains(originalString.charAt(right))){
                characterSet.remove(originalString.charAt(left));
                left++;
            }

            characterSet.add(originalString.charAt(right));

            longest = Math.max(longest, right-left+1);

        }

        if (longest != expectedOutput) {
            throw new RuntimeException("Bad Result: " + longest);
        }
    }
}
