package Learn.RecursionII;

import Tree.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
//        if(root == null) return true;
//        return isValidBSThelper(root, true);
        long lower = Long.MIN_VALUE;
        long upper = Long.MAX_VALUE;
        return isValidBSTHelper2(root, lower, upper);
    }


    //#1 Not accepted
    public boolean isValidBSThelper(TreeNode root, boolean valid) {
        //base case
        if(root.left == null && root.right == null) return valid;
        if(root.left == null){
            return root.val < root.right.val;
        }
        if(root.right == null){
            return root.left.val < root.val;
        }
        if(root.left.val > root.val || root.val > root.right.val) return false;

        //recursive case
        boolean l = isValidBSThelper(root.left, valid);
        boolean r = isValidBSThelper(root.right, valid);

        return l && r;
    }

  // #2 Accepted
  // That means one should keep both upper and lower limits for each node while traversing the tree,
  // and compare the node value not with children values but with these limits.
  public boolean isValidBSTHelper2(TreeNode root, long lower, long upper) {
        //base case
        if(root == null) return true;
        if(root.val >= upper || root.val <= lower) return false;

        //recursive case
        boolean isBSTLeft = isValidBSTHelper2(root.left, lower, root.val);
        boolean isBSTRight = isValidBSTHelper2(root.right, root.val, upper);

        return isBSTLeft && isBSTRight;
    }

    //#3 Not Accepted
    public boolean isValidBSTHelper3(TreeNode root) {
        //base case
        if(root == null) return true;
        if(root.left != null && root.left.val >= root.val) return false;
        if(root.right != null && root.right.val <= root.val) return false;

        //recursive case
        boolean isBSTLeft = isValidBSTHelper3(root.left);
        boolean isBSTRight = isValidBSTHelper3(root.right);

        return isBSTLeft && isBSTRight;
    }

    //https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
    //Method3 -> このコードは実際受からないが、参考になる
}
