package LinkedList;

public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  public static void main(String[] args) {
    ListNode na1 = new ListNode(3);
    ListNode na2 = new ListNode(1);
    ListNode nb1 = new ListNode(2);
    ListNode nb2 = new ListNode(1);

    // Case 1. No intersection
    na1.next = na2;
    nb1.next = nb2;

    ListNode headA = na1.next;
    ListNode headB = nb1.next;

    System.out.println(headA);
    System.out.println(headB);
    System.out.println(headA == headB); // false

    // Case 2. Intersection
    nb1.next = na2;
    headB = nb1.next;

    System.out.println(headA);
    System.out.println(headB);
    System.out.println(headA == headB); // true

    // Traverse through all nodes
    ListNode nc1 = new ListNode(1);
    ListNode nc2 = new ListNode(2);
    ListNode nc3 = new ListNode(3);
    ListNode nc4 = new ListNode(4);
    nc1.next = nc2;
    nc2.next = nc3;
    nc3.next = nc4;

    ListNode head = nc1; // Pointer

    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }


  }
}
