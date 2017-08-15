package linkedList;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;

public class isListPalindrome {
    public boolean isListPalindrome(ListNode<Integer> l) {
        ArrayList<Integer> list = new ArrayList<>();


        while(l != null) {
            list.add(l.value);
            l = l.next;
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }

        int size = array.length;

        for (int i = 0; i < size / 2; i++ ) {
            if(array[i] != array[size - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
