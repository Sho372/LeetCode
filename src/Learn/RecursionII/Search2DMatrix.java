package Learn.RecursionII;

public class Search2DMatrix {

  public static void main(String[] args) {
    int[][] array = {{1, 3, 5}};
    Search2DMatrix s = new Search2DMatrix();
    System.out.print(s.searchMatrix(array, 99));
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0) return false;
    if (matrix[0].length == 0) return false;
    return searchMatrixHelper2(matrix, target, 0, matrix[0].length - 1, 0, matrix.length - 1);
  }

  private boolean searchMatrixHelper(
      int[][] matrix, int target, int rMin, int rMax, int cMin, int cMax) {

    int pRow = (rMin + rMax) / 2;
    int pCol = (cMin + cMax) / 2;
    // System.out.println(pRow);
    // System.out.println(pCol);

    // base case
    if (matrix[pRow][pCol] == target) return true;
    if (rMin >= rMax || cMin >= cMax) return false;

    // recursive case
    if (target < matrix[pRow][pCol]) {
      return searchMatrixHelper(matrix, target, 0, pRow, 0, pCol)
          || searchMatrixHelper(matrix, target, pRow + 1, rMax, 0, pCol)
          || searchMatrixHelper(matrix, target, 0, pRow, pCol + 1, cMax);
    }
    if (target > matrix[pRow][pCol]) {
      return searchMatrixHelper(matrix, target, pRow + 1, rMax, pCol + 1, cMax)
          || searchMatrixHelper(matrix, target, pRow + 1, rMax, 0, pCol)
          || searchMatrixHelper(matrix, target, 0, pRow, pCol + 1, cMax);
    }
    return false;
  }

  /*
      Approach 3: Divide and Conquer
      Accepted
   */
  private boolean searchMatrixHelper2(
      int[][] matrix, int target, int left, int right, int up, int down) {

    // base case
    // empty -> negative area
    if (left > right || up > down) return false;
    // single element
    if (right == left && up == down) return matrix[up][right] == target;

    int pivotX = (left + right) / 2;
    int pivotY = (up + down) / 2;

    if (matrix[pivotY][pivotX] == target) return true;

    // recursive case
    if (target < matrix[pivotY][pivotX]) {
      return searchMatrixHelper2(matrix, target, left, pivotX, up, pivotY)
          || searchMatrixHelper2(matrix, target, left, pivotX, pivotY + 1, down)
          || searchMatrixHelper2(matrix, target, pivotX + 1, right, up, pivotY);
    }
    return searchMatrixHelper2(matrix, target, pivotX + 1, right, pivotY + 1, down)
        || searchMatrixHelper2(matrix, target, left, pivotX, pivotY + 1, down)
        || searchMatrixHelper2(matrix, target, pivotX + 1, right, up, pivotY);
  }
}
