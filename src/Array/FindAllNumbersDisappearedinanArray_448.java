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

  // ToDo time complexity: O(n), space complexity: O(1)
}
