import algorithms.BinarySearch;
import algorithms.BreadthFirstSearch;
import algorithms.SlidingWindowDynamic;
import algorithms.SlidingWindowFixed;
import designpatterns.singleton.ApplicationState;
import designpatterns.strategy.BusStrategy;
import designpatterns.strategy.CarStrategy;
import designpatterns.strategy.Commuter;

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

    Commuter commuterUsesCar = new Commuter(new CarStrategy());
    commuterUsesCar.goToWork();
    Commuter commuterUsesBus = new Commuter(new BusStrategy());
    commuterUsesBus.goToWork();

    ApplicationState applicationState = ApplicationState.getInstance("online");
    ApplicationState applicationState2 = ApplicationState.getInstance("offline");
    applicationState.getState();
    //points to the same object in memory
    applicationState2.getState();

}
