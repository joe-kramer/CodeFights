package arrays;


public class rotateImage {
    public int[][] rotateImage(int[][] a) {
        int size = a.length;
        int[][] b = new int[size][size];
        for(int i = 0; i < a.length; i++) {
            int y = size - 1;
            size--;
            for(int j = 0; j < a.length; j++) {

                b[i][j] = a[i + y][i];
                y--;
            }
        }

        return b;
    }
}
