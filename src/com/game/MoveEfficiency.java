package com.game;

/**
 * Оценка эффективности предполагаемого хода
 */
public class MoveEfficiency implements Move, Comparable<MoveEfficiency>{
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public void move() {

    }

    //сравниваем количество пустых ячеек, потом очки
    @Override
    public int compareTo(MoveEfficiency o) {
        return numberOfEmptyTiles == o.numberOfEmptyTiles
                ?(Integer.compare(score, o.score))
                : (numberOfEmptyTiles > o.numberOfEmptyTiles? 1 : -1);
    }
}
