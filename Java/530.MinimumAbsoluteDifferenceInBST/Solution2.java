// Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

// Example:

// Input:

//    1
//     \
//      3
//     /
//    2

// Output:
// 1

// Explanation:
// The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
// Note: There are at least two nodes in this BST.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Straightforward iterative solution
public class Solution {

    // The inorder traversal of a BST would be sorted.
    public int getMinimumDifference(TreeNode root) {
        TreeNode prev = null;
        int min = Integer.MAX_VALUE;

        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = stack.pop();
                if (prev != null) min = Math.min(min, top.val - prev.val);
                prev = top;
                cur = cur.right;
            }
        }

        return min;
    }
}






