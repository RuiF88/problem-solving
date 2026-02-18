public class BinarySearch {
/*
* You are given the root of a Binary Search Tree (BST) and an integer value target.
* Your task is to determine whether the value exists in the tree.
*/
    public void calculateProblem1(){
        int[] sortedArray = new int[]{2, 3, 4, 5, 8, 10};
        int target = 8;
        int left = 0;
        int right = sortedArray.length-1;

        while (left<=right){
            int mid = (right+left)/2;

            if(sortedArray[mid] == target){
                break;
            } else if(target>sortedArray[mid]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
    }
}
