package LinkedList;

public class MergeTwoSortedLists_21 {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(0);
    ListNode l2 = l1;
    ListNode l3 = new ListNode(1);



    // This is a change of l2's attribute. So l1's attribute is also changed.
    // Not change the reference of l2 to l1
    l2.next = l3;

    System.out.printf("l1: %d\n", l1.next.val);
    System.out.printf("l2: %d\n", l2.next.val);

    // This is a change reference of l2 from l1 to l3
    l2 = l3;
    System.out.printf("l1: %d\n", l1.val);
    System.out.printf("l2: %d\n", l2.val);
  }

  /**
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
   * x) { val = x; } }
   */

  /*
  ``Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
    Memory Usage: 38.8 MB, less than 19.53% of Java online submissions for Merge Two Sorted Lists.
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null && l2 == null) {
        return null;
    }
    if (l1 == null) {
        return l2;
    }
    if (l2 == null) {
        return l1;
    }

    ListNode result = new ListNode(0);
    ListNode prev = result;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        prev.next = l1;
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }

    if (l1 != null) {
        prev.next = l1;
    }
    if (l2 != null) {
        prev.next = l2;
    }
    return result.next;
  }
}

/*
   How to loop in LinkedList

   while(l1 != null){
     l1 = l1.next
   }


          l1       l2
          |        |
   Input: 1->2->4, 1->3->4
   Output: 1->1->2->3->4->4

*/
