package Tree;

public class InvertBinaryTree_226 {

    /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
        Memory Usage: 37.2 MB, less than 5.10% of Java online submissions for Invert Binary Tree.

        Time complexity: O(n)
            n is the number of nodes
            https://stackoverflow.com/questions/4547012/complexities-of-binary-tree-traversals

            n = 1 + 2 + 4 + ... + 2^h-1 + 2^h = 2^h+1 - 1
            h = O(log n)

            Don't misunderstand h is the height of the tree
            https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html

        Space complexity: O(h) = O(log n)?
            https://stackoverflow.com/questions/41201908/why-is-the-space-complexity-of-a-recursive-inorder-traversal-oh-and-not-on
            > So the maximum numbers of memory addresses on the stack at the same time is the tree height.
     */

  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    TreeNode tree = new TreeNode(root.val);
    tree.left = invertTree(root.right);
    tree.right = invertTree(root.left);
    return tree;
  }
}
