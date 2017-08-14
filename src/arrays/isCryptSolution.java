package arrays;

import java.util.HashMap;

public class isCryptSolution {
    public boolean isCryptSolution(String[] crypt, char[][] solution) {
        HashMap<Character, Character> hash = new HashMap<Character, Character>();

        for (int i = 0; i < solution.length; i++) {
            hash.put((Character) solution[i][0], (Character) solution[i][1]);
        }

        String a = "";
        String b = "";
        String c = "";

        for(char x : crypt[0].toCharArray()) {
            a += hash.get(x);
        }
        if (a.toCharArray().length > 1 && a.charAt(0) == '0') {
            return false;
        }
        for(char x : crypt[1].toCharArray()) {
            b += hash.get(x);
        }
        if (b.toCharArray().length > 1 && b.charAt(0) == '0') {
            return false;
        }
        for(char x : crypt[0].toCharArray()) {
            c += hash.get(x);
        }
        if (c.toCharArray().length > 1 && c.charAt(0) == '0') {
            return false;
        }
        return (Long.parseLong(a) + Long.parseLong(b) == Long.parseLong(c));
    }
}
