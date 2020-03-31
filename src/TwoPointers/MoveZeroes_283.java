package TwoPointers;

public class MoveZeroes_283 {

  /*
     Runtime: 57 ms, faster than 5.20% of Java online submissions for Move Zeroes.
     Memory Usage: 40.2 MB, less than 5.59% of Java online submissions for Move Zeroes.
  */

  public static void main(String[] args) {
    MoveZeroes_283 m = new MoveZeroes_283();
    int[] a = {0, 1, 0, 3, 12};
    m.moveZeroes(a);
  }

  /*
     Runtime: 57 ms, faster than 5.20% of Java online submissions for Move Zeroes.
     Memory Usage: 40.2 MB, less than 5.59% of Java online submissions for Move Zeroes.

    Time complexity: O(n^3)
    Space complexity: O(1)
  */
  public void moveZeroes(int[] nums) {
    int cnt = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == 0) {
          for (int k = j; k < nums.length - 1 - cnt; k++) {
            nums[k] = nums[k + 1];
            nums[k + 1] = 0;
          }
        }
      }
    }
    System.out.println(nums);
  }

  /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
    Memory Usage: 40 MB, less than 5.59% of Java online submissions for Move Zeroes.

    Time complexity: O(n)
    Space complexity: O(1)


    Key: collect non zero element at first then insert zero.
  */

  public void moveZeroes2(int[] nums) {
    int lastNonZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[lastNonZeroIndex] = nums[i];
        lastNonZeroIndex++;
      }
    }
    // 0,1,0,3,12 -> 1,3,12,3,12

    for (int i = lastNonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}

/*
i=0
cnt=0

0,1,0,3,12 -> 1,0,3,12,0

i=1
cnt=1

1,0,3,12,0 -> 1,3,12,0,0

i=2
cnt=2

1,3,12,0,0

*/
