package org.hklearning.practice.graphs;

public class ConvertInputToAdjacencyMatrix {

    public static void main(String[] args) {
        int[][] ar = {{2, 4}, {1, 3}, {2, 4}, {1, 3}};
        int[][] adjMat = new int[ar.length+1][ar.length+1];
        System.out.println(STR."ar.length = \{ar.length}");
        for (int[] ints : ar) {
            int a = ints[0];
            int b = ints[1];
            adjMat[a][b] = 1;
            adjMat[b][a] = 1;
        }
        for(int i=0;i<ar.length+1;i++){
            for(int j=0;j<ar.length+1;j++){
                System.out.print(STR."\{adjMat[i][j]} ");
            }
            System.out.println();
        }
    }
}
