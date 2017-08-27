package linkedList;

import java.util.*;

public class mergeTwoLinkedLists {
    public ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> answer = new ListNode<>(0);
        List<Integer> list = new ArrayList<>();
        ListNode<Integer> a1 = answer;

        while(l1 != null) {
            list.add(l1.value);
            l1 = l1.next;
        }

        while(l2 != null) {
            list.add(l2.value);
            l2 = l2.next;
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            a1.next = new ListNode<>(list.get(i));
            a1 = a1.next;
        }
        return answer.next;
    }
}
