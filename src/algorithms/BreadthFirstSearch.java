package algorithms;

import java.util.*;

/*
 *Determine whether the tree contains a node with the value target using
 *Breadth-First Search (level-order traversal).
 */
public class BreadthFirstSearch {

    public static class TreeNode {
        int value;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void calculateProblem1(TreeNode root) {
        int target = 4;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int sizeOfLevel = queue.size();
            List<Integer> newLevel = new ArrayList<>();
            for (int i = 0; i < sizeOfLevel; i++) {
                TreeNode node = queue.poll();
                if(node.value == target){
                    return;
                }
                newLevel.add(node.value);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
        }
    }

}
