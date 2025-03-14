package EasyLevel;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        if(head == null) return new ListNode();
        ListNode newHead = head;
        while (head.next != null){
            if (head.val == val){
                newHead = head.next;
                head.next = new ListNode();
                head = newHead.next;
            }
            head = head.next;
        }


        return newHead;
    }

    public static void printList(ListNode head){
        System.out.println(head.val);
        while (head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);


        printList(removeElements(head,6));

    }
}
