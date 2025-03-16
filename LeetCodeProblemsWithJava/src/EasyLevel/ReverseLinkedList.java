package EasyLevel;

import java.util.Stack;

public class ReverseLinkedList {

    //1ms
    /*
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
     */

    public static ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode newNode = new ListNode();
        ListNode newHead = null;
        while (head != null){
            //System.out.println(head.val);
            stack.push(head);
            head = head.next;
        }

        //System.out.println("*******************************");

        while (!stack.isEmpty()){
            if (newHead == null){

                newNode = stack.pop();
                newHead = newNode;
                continue;
            }else{
                newNode.next = stack.pop();
                newNode = newNode.next;
            }

        }

        newNode.next = null;
        return newHead;
    }

    public static void readList(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        readList(reverseList(head));
    }
}
