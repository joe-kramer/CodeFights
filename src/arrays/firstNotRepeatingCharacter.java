package arrays;

import java.util.Hashtable;

public class firstNotRepeatingCharacter {
    public char firstNotRepeatingCharacter(String s) {
        Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
        for(Character c : s.toCharArray()) {
            if(hash.get(c) == null) {
                hash.put(c, 1);
            } else {
                Integer num = hash.get(c);
                hash.put(c, num + 1);
            }
        }

        for(Character c : s.toCharArray()) {
            Integer i = hash.get(c);
            if (i == 1) {
                return c;
            }
        }
        return '_';

    }
}
