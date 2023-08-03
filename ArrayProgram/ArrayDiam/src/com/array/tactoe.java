package com.array;

public class tactoe {
    public static void main(String[] args) {
        char [][] tac={{'X','O','X'},{'O','X','O'},{'X','O','X'}};
        for(int i=0;i<tac.length;i++){
            for (int j=0;j<tac[i].length;j++){
                System.out.print(tac[i][j]+" ");
            }
            System.out.println();
        }
    }

}
