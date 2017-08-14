package Arrays;

import java.util.HashMap;

public class firstDuplicate {
    public int firstDuplicate(int[] a) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int counter = 0;
        while(counter < a.length) {
            int value = a[counter];
            if (tracker.get(value) == null) {
                tracker.put(value, 1);
            } else if (tracker.get(value) == 1) {
                return value;
            }
            counter++;
        }
        return -1;
    }

}
