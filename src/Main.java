import Arrays.*;

public class Main {

    public static void main(String[] args) {
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
        isCryptSolution solution = new isCryptSolution();
        boolean answer = solution.isCryptSolution(crypt2, solution2);
        System.out.println(answer);
    }
}
