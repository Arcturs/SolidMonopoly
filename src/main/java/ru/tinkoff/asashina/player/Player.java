package ru.tinkoff.asashina.player;

import lombok.Getter;
import ru.tinkoff.asashina.street.before.Street;
import ru.tinkoff.asashina.enumeration.Colour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Player {

    private static final int START_CASH = 1500;

    private final String name;
    private final Map<Colour, List<Street>> streetsByColour;
    private final List<Colour> monopolies;
    private final List<Street> bailedStreets;
    private int cash = START_CASH;

    public Player(String name) {
        this.name = name;
        this.streetsByColour = new HashMap<>();
        this.monopolies = new ArrayList<>();
        this.bailedStreets = new ArrayList<>();
    }

    public int addMoney(int money) {
        cash += money;
        return cash;
    }

    public void addStreet(Street street) {
        List<Street> streets = streetsByColour.getOrDefault(street.getColour(), new ArrayList<>());
        streets.add(street);
        streetsByColour.put(street.getColour(), streets);
    }

    public void addMonopoly(Colour colour) {
        monopolies.add(colour);
    }

    public void addStreetOnBail(Street street) {
        bailedStreets.add(street);
    }

    public List<Street> getAllStreets() {
        return streetsByColour.values()
                .stream()
                .flatMap(List::stream)
                .toList();
    }

}
