package ru.tinkoff.asashina.cell;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.enumeration.CellType;

@Getter
@Setter
public abstract class Cell {

    private final CellType type;
    private final int position;

    public Cell (CellType type, int number) {
        this.type = type;
        this.position = number;
    }

    public abstract void doAction();

}
