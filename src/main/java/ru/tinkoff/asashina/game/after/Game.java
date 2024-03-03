package ru.tinkoff.asashina.game.after;

import lombok.Getter;
import ru.tinkoff.asashina.cell.Cell;

@Getter
public class Game {

    private final Cell[] gameBoard = initCells();
    private final MessageSender messageSender;

    public Game(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    private static Cell[] initCells() {
        // init cells
        return new Cell[40];
    }

    public Cell getCell(int position) {
        return gameBoard[position];
    }

    public void setCell(Cell cell) {
        gameBoard[cell.getPosition()] = cell;
    }

    public void sendMessage(String message) {
        messageSender.sendMessage(message);
    }

}
