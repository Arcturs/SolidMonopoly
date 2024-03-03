package ru.tinkoff.asashina.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.awt.Color;

@Getter
@AllArgsConstructor
public enum Colour {

    BROWN("brown", new Color(149, 49, 1)),
    CYAN("cyan", Color.CYAN),
    PINK("pink", Color.PINK),
    ORANGE("orange", Color.ORANGE),
    RED("red", Color.RED),
    YELLOW("yellow", Color.YELLOW),
    GREEN("green", Color.GREEN),
    BLUE("blue", Color.BLUE),
    RAILROAD("railroad", Color.BLACK),
    ENERGY("energy", new Color(160, 32, 222));

    private final String code;
    private final Color color;

    public static Colour fromStringToColour(String value) throws NoSuchFieldException {
        return Arrays.stream(Colour.values())
                .filter(colour -> colour.code.equals(value))
                .findAny()
                .orElseThrow(() -> new NoSuchFieldException("Color with value %s does not exist".formatted(value)));
    }

}
