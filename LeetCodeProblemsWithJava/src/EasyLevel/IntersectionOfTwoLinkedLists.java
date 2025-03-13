package EasyLevel;

import java.util.List;

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode hA = headA;
        ListNode hB = headB;

        while (hA != hB){
            hA = (hA == null) ? headB : hA.next;
            hB = (hB == null) ? headA : hB.next;
        }

        return hA;
    }

    public static void main(String[] args) {
        ListNode child = new ListNode(8);
        child.next = new ListNode(4);
        child.next.next = new ListNode(5);

        ListNode aHead = new ListNode(4);
        aHead.next = new ListNode(1);
        aHead.next.next = child;

        ListNode bHead = new ListNode(5);
        bHead.next = new ListNode(6);
        bHead.next.next = new ListNode(1);
        bHead.next.next.next = child;

        //System.out.println(aHead.next == bHead.next.next);
        System.out.println(getIntersectionNode(aHead,bHead).val);



    }
}
