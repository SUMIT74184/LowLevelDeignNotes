package TicTacToe.Model;

import java.util.ArrayList;
import java.util.*;
import com.sun.tools.javac.util.Pair;

public class Board {

    public class Pair<K, V> {
        public K first;
        public V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
    }
    public int size;
    public PlayingPiece[][]board;

    public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }
    public boolean addPiece(int row,int column,PlayingPiece playingPiece){
        if(board[row][column]!=null){
            return false;
        }
        board[row][column]=playingPiece;
            return true;

    }

    public List<Pair<Integer,Integer>>getFreeCells(){
        List<Pair<Integer,Integer>>freeCells=new ArrayList<>();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Pair<Integer,Integer>rowColumn=new Pair<>(1,1);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

}
