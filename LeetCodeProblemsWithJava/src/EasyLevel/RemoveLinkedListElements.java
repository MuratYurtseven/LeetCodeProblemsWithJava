package EasyLevel;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        
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
        head.next = new ListNode(1);
        /*head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);*/


        printList(removeElements(head,1));

    }
}
