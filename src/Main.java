import arrays.*;
import linkedList.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        FIRSTDUPLICATE
//        int[] array1 = {2, 3, 3, 1, 5, 2};
//        firstDuplicate arraySolution1 = new firstDuplicate();
//        int answer1 = arraySolution1.firstDuplicate(array1);
//        System.out.println(answer1);
//
//        //FIRSTNOTREPEATINGCHARACTER
//        String s = "abacabad";
//        firstNotRepeatingCharacter arraySolution2 = new firstNotRepeatingCharacter();
//        char answer2 = arraySolution2.firstNotRepeatingCharacter(s);
//        System.out.println(answer2);
//
//        //ROTAGEIMAGE
//        int[][] array3 = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        rotateImage arraySolution3 = new rotateImage();
//        int[][] answer3 = arraySolution3.rotateImage(array3);
//        System.out.println(answer3);
//
//        //SUDOKU2
//        char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
//        {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
//        {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
//        {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
//        {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
//        {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
//        {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
//        {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
//        sudoku2 arraysolution4 = new sudoku2();
//        boolean answer4 = arraysolution4.sudoku2(grid);
//        System.out.println(answer4);
//
//        //ISCRYPTSOLUTION
//        String[] crypt2 = {"SEND", "MORE", "MONEY"};
//        char[][] solution2 = {{'O', '0'},
//                {'M', '1'},
//                {'Y', '2'},
//                {'E', '5'},
//                {'N', '6'},
//                {'D', '7'},
//                {'R', '8'},
//                {'S', '9'}};
//        isCryptSolution arraySolution5 = new isCryptSolution();
//        boolean answer5 = arraySolution5.isCryptSolution(crypt2, solution2);
//        System.out.println(answer5);

        //REMOVEKFROMLIST
//        removeKFromList linkedListSolution1 = new removeKFromList();
//        ListNode<Integer> node3 = new ListNode<>(3);
//        ListNode<Integer> node1 = new ListNode<>(1);
//        ListNode<Integer> node2 = new ListNode<>(2);
//        ListNode<Integer> node3b = new ListNode<>(1);
//        ListNode<Integer> node4 = new ListNode<>(4);
//        ListNode<Integer> node5 = new ListNode<>(5);
//
//        node3.next = node1;
//        node1.next = node2;
//        node2.next = node3b;
//        node3b.next = node4;
//        node4.next = node5;
//        node5.next = null;
//
//        int k = 3;
//
//        ListNode<Integer> answer6 = linkedListSolution1.removeKFromList(node3, k);
//        System.out.println(answer6);

        //ISLISTPALINDROME
//        isListPalindrome linkedListSolution2 = new isListPalindrome();
//        ListNode<Integer> firstNode = new ListNode<>(0);
//        ListNode<Integer> secondNode = new ListNode<>(2);
//        ListNode<Integer> thirdNode = new ListNode<>(2);
//        ListNode<Integer> fourthNode = new ListNode<>(3);
//
//        firstNode.next = secondNode;
//        secondNode.next = thirdNode;
//        thirdNode.next = fourthNode;
//        fourthNode.next = null;
//
//        boolean answer7 = linkedListSolution2.isListPalindrome(firstNode);
//        System.out.println(answer7);

        //ADDTWOHUGENUMBERS
//        addTwoHugeNumbers linkedListSolution3 = new addTwoHugeNumbers();
//        ListNode<Integer> a1 = new ListNode<>(1);
////        ListNode<Integer> a2 = new ListNode<>(5432);
////        ListNode<Integer> a3 = new ListNode<>(1999);
////        a1.next = a2;
////        a2.next = a3;
//        a1.next = null;
//
//        ListNode<Integer> b1 = new ListNode<>(9999);
//        ListNode<Integer> b2 = new ListNode<>(9999);
//        ListNode<Integer> b3 = new ListNode<>(9999);
//        ListNode<Integer> b4 = new ListNode<>(9999);
//        ListNode<Integer> b5 = new ListNode<>(9999);
//        ListNode<Integer> b6 = new ListNode<>(9999);
//        b1.next = b2;
//        b2.next = b3;
//        b3.next = b4;
//        b4.next = b5;
//        b5.next = b6;
//        b6.next = null;
//
//        ListNode<Integer> answer8 = linkedListSolution3.addTwoHugeNumbers(a1, b1);
//
//        System.out.println(answer8);

        //MERGETWOLINKEDLISTS
        mergeTwoLinkedLists linkedListSolution4 = new mergeTwoLinkedLists();

        ListNode<Integer> l1 = new ListNode<>(1);
        ListNode<Integer> l1b = new ListNode<>(9);
        ListNode<Integer> l1c = new ListNode<>(3);
        l1.next = l1b;
        l1b.next = l1c;
        l1c.next = null;

        ListNode<Integer> l2 = new ListNode<>(4);
        ListNode<Integer> l2b = new ListNode<>(5);
        ListNode<Integer> l2c = new ListNode<>(6);
        l2.next = l2b;
        l2b.next = l2c;
        l2c.next = null;


        ListNode<Integer> answer9 = linkedListSolution4.mergeTwoLinkedLists(l1, l2);
        System.out.println(answer9);
    }
}
