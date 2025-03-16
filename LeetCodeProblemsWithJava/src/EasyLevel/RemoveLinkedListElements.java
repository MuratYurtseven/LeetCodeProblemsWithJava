package EasyLevel;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevNode = dummy;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val == val) {
                prevNode.next = currentNode.next;
            } else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        return dummy.next;
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
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);


        printList(removeElements(head,6));

    }
}
