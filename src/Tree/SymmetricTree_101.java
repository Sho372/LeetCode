package Tree;

public class SymmetricTree_101 {

  public boolean isSymmetric(TreeNode root) {
    return isSymmetricHelper(root, root);
  }

  private boolean isSymmetricHelper(TreeNode lRoot, TreeNode rRoot) {
    if (lRoot == null && rRoot == null) return true;
    if (lRoot == null || rRoot == null) return false;
    return (lRoot.val == rRoot.val)
        && isSymmetricHelper(lRoot.right, rRoot.left)
        && isSymmetricHelper(rRoot.left, lRoot.right);
  }

  //  public boolean isSymmetric(TreeNode root) {
  //
  //    if (root == null) return true;
  //    if (root.left == null && root.right == null) return true;
  //    if (root.left != null && root.right != null) return isSymmetricHelper(root.left,
  // root.right);
  //    return false;
  //  }
  //
  //  private boolean isSymmetricHelper(TreeNode lRoot, TreeNode rRoot) {
  //    // base case
  //    if (lRoot.left == null && lRoot.right == null && rRoot.left == null && rRoot.right == null)
  // {
  //      return lRoot.val == rRoot.val;
  //    }
  //
  //    // recursive case
  //    if (lRoot.val == rRoot.val) {
  //
  //      if ((lRoot.left == null && rRoot.left == null && lRoot.right == null && rRoot.right ==
  // null))
  //        return false;
  //
  //      return isSymmetricHelper(lRoot.left, rRoot.right)
  //          && isSymmetricHelper(lRoot.right, rRoot.left);
  //
  //    } else {
  //      return false;
  //    }
  //  }
}
