package linkedList;

import java.math.BigInteger;

public class addTwoHugeNumbers {
    public ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

        String stringA = "";
        String stringB = "";
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> head = result;
        ListNode<Integer> nodeA = a;
        ListNode<Integer> nodeB = b;
        int valueSize = 4;
        int totalSize = 0;
        String totalString;


        while (nodeA != null) {
            String formatA = String.format("%0" + valueSize + "d", nodeA.value);
            stringA += formatA;
            nodeA = nodeA.next;
        }

        while (nodeB != null) {
            String formatB = String.format("%0" + valueSize + "d", nodeB.value);
            stringB += formatB;
            nodeB = nodeB.next;
        }

        BigInteger totalA = new BigInteger(stringA);
        BigInteger totalB = new BigInteger(stringB);
        BigInteger total = totalA.add(totalB);
        totalString = total.toString();
        totalSize = total.toString().length();

        if(totalString.length() % 4 != 0) {
            int extra = 4 - totalString.length() % 4;
            String extraString = "";
            for(int i_0 = 0; i_0 < extra; i_0++) {
                extraString += "0";
            }
            totalString = extraString + totalString;
        }

        int i = 0;
        while (i < totalSize) {
            String value;
            value = totalString.substring(i, i + valueSize);
            value = removeLeadingZeroes(value);
            head.next = new ListNode<>(Integer.parseInt(value));
            head = head.next;
            i += valueSize;
        }

        return result.next;
    }

    public static String removeLeadingZeroes(String value) {
        boolean allZero = true;
        for (int i = 0; i < value.length() && allZero; i++) {
            if (value.charAt(i) != '0') {
                allZero = false;
            }
        }

        if (allZero) {
            return "0";
        } else {
            while (value.indexOf("0") == 0) {
                value = value.substring(1);
            }
        }
        return value;
    }
}



