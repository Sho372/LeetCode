package Tree;

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
Memory Usage: 41.7 MB, less than 22.22% of Java online submissions for Merge Two Binary Trees.
 */

public class MergeTwoBinaryTrees_617 {

  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(3);
    TreeNode node3 = new TreeNode(5);
    TreeNode node4 = new TreeNode(2);

    root1.left = node2;
    root1.right = node4;
    node2.left = node3;
    MergeTwoBinaryTrees_617 m = new MergeTwoBinaryTrees_617();
    System.out.println(m.preOrder(root1, root1));
  }

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    return preOrder(t1, t2);
  }

  public TreeNode preOrder(TreeNode t1, TreeNode t2) {
    int val = 0;
    if (t1 == null && t2 == null) {
      return null;
    } else if (t1 == null) {
      return t2;
    } else if (t2 == null) {
      return t1;
    }
    t1.val = t1.val + t2.val;
    t1.left = preOrder(t1.left, t2.right);
    t1.right = preOrder(t1.right, t2.right);
    return t1;
  }
}
