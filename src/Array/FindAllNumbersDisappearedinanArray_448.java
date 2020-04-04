package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedinanArray_448 {
  /*
     Runtime: 28 ms, faster than 5.44% of Java online submissions for Find All Numbers Disappeared in an Array.
     Memory Usage: 49.3 MB, less than 32.08% of Java online submissions for Find All Numbers Disappeared in an Array.
  */

  public List<Integer> findDisappearedNumbers(int[] nums) {

    HashMap<Integer, Integer> counters = new HashMap<>();
    for (int i = 1; i <= nums.length; i++) {
      counters.put(i, 0);
    }

    for (int num : nums) {
      counters.put(num, counters.get(num) + 1);
    }

    List<Integer> ans = new ArrayList<>();
    for (Integer key : counters.keySet()) {
      if (counters.get(key) == 0) {
        ans.add(key);
      }
    }
    return ans;
  }

  /*
    Runtime: 5 ms, faster than 81.54% of Java online submissions for Find All Numbers Disappeared in an Array.
    Memory Usage: 48.4 MB, less than 33.96% of Java online submissions for Find All Numbers Disappeared in an Array.
  */

  public List<Integer> findDisappearedNumbers2(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      // convert to index
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] > 0) {
        // mark with reversing to negative
        nums[index] = -nums[index];
      }
    }

    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        ans.add(i + 1);
      }
    }
    return ans;
  }

  /*

  Key:
    1. convert to index: abs(num[i]) - 1
    2. mark with reversing to negative: nums[i] = -nums[i]

  In the first loop, mark the number with negative.

  [4,3,2,7,8,2,3,1] -> 5,6

  [4,3,2,-7,8,2,3,1] -> reverse from 7 to -7
  [4,3,-2,-7,8,2,3,1]
  [4,3,-2,-7,8,2,3,1] -> even if the number is negative, take abs and convert to index
  [4,-3,-2,-7,8,2,-3,1]
  [4,3,-2,-7,8,2,-3,-1]
  [4,-3,-2,-7,8,2,-3,-1]
  [4,-3,-2,-7,8,2,-3,-1]
  [-4,-3,-2,-7,8,2,-3,-1]


  In the second loop, find out a positive number and return the index

  [-4,-3,-2,-7,8,2,-3,-1]

               |
  [-4,-3,-2,-7,8,2,-3,-1] -> index = 4 -> missing number 5
                 |
  [-4,-3,-2,-7,8,2,-3,-1] -> index = 5 -> missing number 6

   */

}
