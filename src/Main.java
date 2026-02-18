void main() {
    //instantiate what class and run problems. If no exception are thrown then all is correct
    SlidingWindowFixed slidingWindowFixed = new SlidingWindowFixed();
    slidingWindowFixed.calculateProblem1();
    slidingWindowFixed.calculateProblem2();

    SlidingWindowDynamic slidingWindowDynamic = new SlidingWindowDynamic();
    slidingWindowDynamic.calculateProblem1();
    slidingWindowDynamic.calculateProblem2();

    BinarySearch binarySearch = new BinarySearch();
    binarySearch.calculateProblem1();

    BreadthFirstSearch.TreeNode root = new BreadthFirstSearch.TreeNode(5);
    root.left = new BreadthFirstSearch.TreeNode(3);
    root.right = new BreadthFirstSearch.TreeNode(8);
    root.left.left = new BreadthFirstSearch.TreeNode(2);
    root.left.right = new BreadthFirstSearch.TreeNode(4);
    root.right.right = new BreadthFirstSearch.TreeNode(10);

    BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
    breadthFirstSearch.calculateProblem1(root);


}
