package org.hklearning.leetcode150.contructquadtree427;

public class Attempt1 {
    public Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length);
    }

    private Node build(int[][] grid, int r, int c, int size) {
        if (isAllSame(grid, r, c, size)) {
            return new Node(grid[r][c] == 1, true);
        }

        Node root = new Node(true, false);
        int half = size / 2;

        root.topLeft = build(grid, r, c, half);
        root.topRight = build(grid, r, c + half, half);
        root.bottomLeft = build(grid, r + half, c, half);
        root.bottomRight = build(grid, r + half, c + half, half);

        return root;
    }

    private boolean isAllSame(int[][] grid, int r, int c, int size) {
        int val = grid[r][c];
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (grid[i][j] != val) return false;
            }
        }
        return true;
    }
}
