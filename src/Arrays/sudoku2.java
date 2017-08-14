package Arrays;


import java.util.HashMap;

public class sudoku2 {
    public boolean sudoku2(char[][] grid) {
        //horizontal
        for(int i = 0; i < grid.length; i++) {
            HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
            for(char c : grid[i]) {
                if(hash.get(c) != null && c != '.') {
                    return false;
                } else {
                    hash.put(c, 1);
                }
            }
        }
        //vertical
        for (int j = 0; j < grid.length; j++) {
            HashMap<Character, Integer> hash2 = new HashMap<Character, Integer>();

            for(int y = 0; y < grid.length; y++) {
                if(hash2.get(grid[y][j]) != null && grid[y][j] != '.') {
                    return false;
                } else {
                    hash2.put(grid[y][j], 1);
                }
            }
        }
        //squares
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if((r + 1) % 3 == 0 && (c + 1) % 3 == 0) {
                    HashMap<Character, Integer> hash3 = new HashMap<Character, Integer>();
                    for (int x = 0; x < 3; x++) {
                        for(int y = 0; y < 3; y++) {
                            if(hash3.get(grid[r - x][c - y]) != null && grid[r - x][c - y] != '.') {
                                return false;
                            } else {
                                hash3.put(grid[r - x][c - y], 1);
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
