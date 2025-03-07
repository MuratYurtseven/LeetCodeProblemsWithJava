package EasyLevel;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        Map<ListNode,Integer> nonDuplicatesNodes = new LinkedHashMap<>();
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (head != null){
            if(!nonDuplicatesNodes.containsValue(head.val)){
                nonDuplicatesNodes.put(head,head.val);
            }
            head = head.next;
        }

        for (Integer value : nonDuplicatesNodes.values()) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1,
                new ListNode(1,
                        new ListNode(3, null)));

        ListNode result = deleteDuplicates(list);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" - ");
            }
            result = result.next;
        }
    }
}
