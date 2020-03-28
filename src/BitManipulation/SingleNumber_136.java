package BitManipulation;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber_136 {

  public int singleNumber(int[] nums) {
    /*
      HashTable
      Time complexity: O(n)

      Runtime: 7 ms, faster than 21.25% of Java online submissions for Single Number.
      Memory Usage: 40.7 MB, less than 77.04% of Java online submissions for Single Number.

     */
    HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
    for (int num : nums) {
      if (table.containsKey(num)) {
        table.put(num, table.get(num) + 1);
      } else {
        table.put(num, 1);
      }
    }

    Set<Integer> keys = table.keySet();
    for (Integer key : keys) {
      if (table.get(key) == 1) return key;
    }
    return 0;
  }

  /*
    Bit manipulation -> XOR
    Time complexity: O(n)
    Space complexity: O(1)

    Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
    Memory Usage: 40.8 MB, less than 73.33% of Java online submissions for Single Number.

   */

  public int singleNumberWithXOR(int[] nums) {
      int a = 0;
      for (int n : nums) {
          a = a ^ n;
      }
      return a;
  }

}
