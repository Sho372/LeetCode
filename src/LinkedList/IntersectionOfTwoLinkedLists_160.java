package LinkedList;

import java.util.HashMap;
import java.util.Map;

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


    //Hash Map
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> map = new HashMap<>();

        ListNode pointerA = headA;
        while (pointerA != null) {
            if(map.containsKey(pointerA)) {
                map.put(pointerA, map.get(pointerA) + 1);
            } else {
                map.put(pointerA, 1);
            }
            pointerA = pointerA.next;
        }

        ListNode pointerB = headB;
        while (pointerB != null) {
            if(map.containsKey(pointerB)) {
                map.put(pointerB, map.get(pointerB) + 1);
            } else {
                map.put(pointerB, 1);
            }

            if(map.get(pointerB) == 2) return pointerB;

            pointerB = pointerB.next;
        }

        return null;
    }

}
