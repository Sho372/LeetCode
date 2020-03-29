package LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLinkedList_206 {

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = null;

    ReverseLinkedList_206 s = new ReverseLinkedList_206();
    s.reverseList(n1);
  }

  /*
    Runtime: 2 ms, faster than 6.09% of Java online submissions for Reverse Linked List.
    Memory Usage: 40 MB, less than 5.04% of Java online submissions for Reverse Linked List.
  */

  public ListNode reverseList(ListNode head) {

    Queue<ListNode> q = new LinkedList<>();
    while (head != null) {
      q.add(head);
      head = head.next;
    }

    ListNode prev = null;
    ListNode current = null;
    while (!q.isEmpty()) {
      ListNode temp = q.poll();
      prev = current;
      temp.next = prev;
      current = temp;
    }
    return current;
  }
}
