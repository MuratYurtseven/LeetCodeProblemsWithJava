package EasyLevel;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode twoStep = head;
        ListNode oneStep = head;
        while (twoStep.next.next != null && oneStep.next != null){
            twoStep = twoStep.next.next;
            oneStep = oneStep.next;
            if(twoStep == oneStep){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(-4);
        root.next.next.next.next = root.next;

        System.out.println(hasCycle(root));
    }
}
