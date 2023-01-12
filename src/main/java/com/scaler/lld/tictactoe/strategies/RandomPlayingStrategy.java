package com.scaler.lld.tictactoe.strategies;

import java.util.List;

import com.scaler.lld.tictactoe.models.Board;
import com.scaler.lld.tictactoe.models.BoardCell;
import com.scaler.lld.tictactoe.models.Move;

public class RandomPlayingStrategy implements PlayingStrategy {

    @Override
    public Move play(Board board) {

        // Get the available cells
        List<BoardCell> availableCells = board.getAvailableCells();

        // Generate a random number with the size of the available cells
        int randomIndex = (int) (Math.random() * availableCells.size());

        // Return the random cell
        BoardCell randomCell = availableCells.get(randomIndex);
        return new Move(randomCell.getRow(), randomCell.getColumn());
    }
    
}