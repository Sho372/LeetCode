package Tree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class DiameterOfBinaryTree_543 {

  /*
   102 / 106 test cases passed.
  */

  public int diameterOfBinaryTree(TreeNode root) {

    if (root == null || (root.left == null && root.right == null)) {
      return 0;
    } else if (root.left == null) {
      return dfs(root.right) + 1;
    } else if (root.right == null) {
      return dfs(root.left) + 1;
    }
    return dfs(root.left) + dfs(root.right) + 2;
  }

  private int dfs(TreeNode root) {
    // base case
    if (root == null || (root.left == null && root.right == null)) {
      return 0;
    }
    // recursive case
    int maxL = 1 + dfs(root.left);
    int maxR = 1 + dfs(root.right);
    return Math.max(maxL, maxR);
  }

  /*
   Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
   Memory Usage: 39.4 MB, less than 18.18% of Java online submissions for Diameter of Binary Tree.
  */

  int d = 0;

  public int diameterOfBinaryTree2(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return 0;
    }
    dfs2(root);
    return d - 1;
  }

  private int dfs2(TreeNode root) {

    if (root == null) return 0;

    int L = dfs2(root.left);
    int R = dfs2(root.right);
    // Key: memo the diameter. The diameter of binary tree is defined with L+R.
    // メモしてから、深さを返す
    d = Math.max(d, L + R);

    // Return the depth(from the leaf node) with 1 + dfs().
    return Math.max(L + 1, R + 1);
  }
}
