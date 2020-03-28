package Tree;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 39.8 MB, less than 69.89% of Java online submissions for Maximum Depth of Binary Tree.
 */

public class MaximumDepthOfBinaryTree_104 {
  public int maxDepth(TreeNode root) {
      return findDepth(root, 0);
  }

  private int findDepth(TreeNode root, int depth) {

      if (root == null) {
          return depth;
      }
      depth++;
      return Math.max(findDepth(root.left, depth), findDepth(root.right, depth));
  }
}
