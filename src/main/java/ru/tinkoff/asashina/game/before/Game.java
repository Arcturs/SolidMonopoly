package ru.tinkoff.asashina.game.before;

import lombok.Getter;
import ru.tinkoff.asashina.cell.Cell;
import ru.tinkoff.asashina.client.before.ConsoleClient;
import ru.tinkoff.asashina.client.before.HttpClient;
import ru.tinkoff.asashina.client.before.UiClient;
import ru.tinkoff.asashina.player.Player;
import ru.tinkoff.asashina.street.before.Street;

@Getter
public class Game {

    private final Cell[] gameBoard = initCells();

    private ConsoleClient consoleClient;
    private UiClient uiClient;
    private HttpClient httpClient;

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

    public void setStreetOnBail(Street street, Player player) {
        street.setOnBail();
        player.addStreetOnBail(street);
    }

    public void buildHouseOrHotel(Street street) {
        if (street.getHouses() == 4) {
            street.setHouses(0);
            street.buildHotel();
        } else {
            street.buildHouse();
        }
    }

    public void checkCash(Player player, int price) {
        while (player.getCash() < price && !player.getAllStreets().isEmpty()) {
            // bail or sell
        }
        if (player.getCash() < price && player.getAllStreets().isEmpty()) {
            sendMessage("Player is bankrupt");
        }
    }

    public void sendMessage(String message) {
        if (consoleClient != null) {
            consoleClient.sendMessageInConsole(message);
        } else if (httpClient != null) {
            httpClient.sendMessage(message);
        } else {
            uiClient.showMessageOnPanel(message);
        }
    }

}
