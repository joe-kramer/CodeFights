import Arrays.*;

public class Main {

    public static void main(String[] args) {

        //firstDuplicate
        int[] array1 = {2, 3, 3, 1, 5, 2};
        firstDuplicate arraySolution1 = new firstDuplicate();
        int answer1 = arraySolution1.firstDuplicate(array1);
        System.out.println(answer1);

        //firstNotRepeatingCharacter
        String s = "abacabad";
        firstNotRepeatingCharacter arraySolution2 = new firstNotRepeatingCharacter();
        char answer2 = arraySolution2.firstNotRepeatingCharacter(s);
        System.out.println(answer2);

        //rotateImage
        int[][] array3 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotateImage arraySolution3 = new rotateImage();
        int[][] answer3 = arraySolution3.rotateImage(array3);
        System.out.println(answer3);

        //isCryptSolution
        String[] crypt2 = {"SEND", "MORE", "MONEY"};
        char[][] solution2 = {{'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}};
        isCryptSolution arraySolution5 = new isCryptSolution();
        boolean answer5 = arraySolution5.isCryptSolution(crypt2, solution2);
        System.out.println(answer5);
    }
}
