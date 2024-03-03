package ru.tinkoff.asashina.game.after;

import lombok.Getter;
import ru.tinkoff.asashina.cell.Cell;
import ru.tinkoff.asashina.client.before.ConsoleClient;
import ru.tinkoff.asashina.client.before.HttpClient;
import ru.tinkoff.asashina.client.before.UiClient;
import ru.tinkoff.asashina.player.Player;
import ru.tinkoff.asashina.street.before.Street;

import java.util.List;

@Getter
public class Game {

    private final Cell[] gameBoard = CellInitializer();
    private final SendMessageInterface sendMessageInterface;

    public Game(SendMessageInterface sendMessageInterface) {
        this.sendMessageInterface = sendMessageInterface;
    }

    private static Cell[] CellInitializer () {
        // init cells
        return new Cell[40];
    }

    public Cell getCell(int position) {
        return gameBoard[position];
    }

    public void setCell (Cell cell) {
        gameBoard[cell.getPosition()] = cell;
    }

}
