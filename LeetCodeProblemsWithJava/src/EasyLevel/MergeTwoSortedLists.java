package EasyLevel;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (list1 != null && list2 != null){
            if(list1.val <list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 != null){
            tail.next = list1;
        }
        else if(list2 != null){
            tail.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3, null)));

        ListNode list2 = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3, null))));

        ListNode result = mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" - ");
            }
            result = result.next;
        }
    }
}
