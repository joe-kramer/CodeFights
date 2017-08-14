import arrays.*;
import linkedList.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        firstDuplicate
//        int[] array1 = {2, 3, 3, 1, 5, 2};
//        firstDuplicate arraySolution1 = new firstDuplicate();
//        int answer1 = arraySolution1.firstDuplicate(array1);
//        System.out.println(answer1);
//
//        //firstNotRepeatingCharacter
//        String s = "abacabad";
//        firstNotRepeatingCharacter arraySolution2 = new firstNotRepeatingCharacter();
//        char answer2 = arraySolution2.firstNotRepeatingCharacter(s);
//        System.out.println(answer2);
//
//        //rotateImage
//        int[][] array3 = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//        rotateImage arraySolution3 = new rotateImage();
//        int[][] answer3 = arraySolution3.rotateImage(array3);
//        System.out.println(answer3);
//
//        //sudoku2
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
//        //isCryptSolution
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

        //removeKFromList
        removeKFromList linkedListSolution1 = new removeKFromList();
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3b = new ListNode<>(1);
        ListNode<Integer> node4 = new ListNode<>(4);
        ListNode<Integer> node5 = new ListNode<>(5);

        node3.next = node1;
        node1.next = node2;
        node2.next = node3b;
        node3b.next = node4;
        node4.next = node5;
        node5.next = null;

        int k = 3;

        ListNode<Integer> answer6 = linkedListSolution1.removeKFromList(node3, k);
        System.out.println(answer6);
    }
}
