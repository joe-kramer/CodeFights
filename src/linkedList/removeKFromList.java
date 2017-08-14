package linkedList;

public class removeKFromList {
    public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode node = new ListNode(0);
        ListNode temp = node;
        if (l == null) {
            return l;
        }

        while (l != null) {
            if (l.value != k) {
                temp.next = l;
                temp = temp.next;
            }
            l = l.next;

        }
        temp.next = null;
        return node.next;
    }

}

// Definition for singly-linked list:

