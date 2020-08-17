package LinkedList;

public class IntersectionOfTwoLinkedLists_160 {

    // Brute force -> O(nm)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;

        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1 != null) {
            while(p2 != null) {
                if(p1 == p2) return p1;
                p2 = p2.next;
            }
            p1 = p1.next;
            p2 = headB;
        }

        // No intersection
        return null;
    }

}
