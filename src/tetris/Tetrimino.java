/*
 * Copyright (c) 2008-2014 Maxifier Ltd. All Rights Reserved.
 */
package tetris;

/**
 * Tetrimino
 *
 * @author Nikita Glashenko (nikita.glashenko@maxifier.com) (2014-11-22 13:37)
 */
public class Tetrimino {
    private final int topRow, leftCol;
    private final boolean[][] b;

    public Tetrimino(int topRow, int leftCol, boolean[][] b) {
        this.topRow = topRow;
        this.leftCol = leftCol;
        this.b = b;
    }

    public int getTopRow() {
        return topRow;
    }

    public int getLeftCol() {
        return leftCol;
    }

    public int getWidth() {
        return b[0].length;
    }

    public int getHeight() {
        return b.length;
    }

    public boolean get(int row, int col) {
        return b[row][col];
    }

    public Tetrimino rotateCW() {
        boolean[][] newB = new boolean[b[0].length][b.length];
        for (int newRow = 0; newRow < newB.length; newRow++) {
            for (int newCol = 0; newCol < newB[0].length; newCol++) {
                newB[newRow][newCol] = b[newB[0].length - newCol - 1][newRow];
            }
        }
        return new Tetrimino(topRow, leftCol, newB);
    }
}