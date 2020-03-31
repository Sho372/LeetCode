package Array;

import java.util.HashMap;

public class MajorityElement_169 {

  public static void main(String[] args) {
    //
  }

  /*
    Runtime: 12 ms, faster than 15.78% of Java online submissions for Majority Element.
    Memory Usage: 45.3 MB, less than 5.15% of Java online submissions for Majority Element.

    Time complexity: O(n)
    Space complexity: O(n) -> At most, the HashMap can contain n-(n/2)
  */

  public int majorityElement(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap();

    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], 1);
      } else {
        map.put(nums[i], map.get(nums[i]) + 1);
      }
      if (map.get(nums[i]) > nums.length / 2) {
        return nums[i];
      }
    }
    return 0;
  }

  // ToDo Divide and Conquer
  // ToDo Bit Manipulation
}
