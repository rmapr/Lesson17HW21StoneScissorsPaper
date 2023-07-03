package game.entity;

import game.exceptions.IndexOutOfRangeException;

public class MatrixOfResults {
    final Integer[][] INTS = {
            {6, 0, 1},
            {2, 7, 3},
            {4, 5, 8}};

    public Integer getMatrixOfResult (Integer i, Integer j){
        if (i > 2 || i < 0 || j > 2 || j < 0)
            throw new IndexOutOfRangeException("Index out of range.");
        return INTS[i][j];
    }
    public void printWinner(Integer intWin){
        System.out.println(ResultWin.values()[intWin].getName());
    }
}
