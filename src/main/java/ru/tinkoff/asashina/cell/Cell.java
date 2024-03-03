package ru.tinkoff.asashina.cell;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.enumeration.CellType;
import ru.tinkoff.asashina.street.after.Street;

@Getter
@Setter
public class Cell {

    private final CellType type;
    private final int position;

    private Street street;

    public Cell (CellType type, int number) {
        this.type = type;
        this.position = number;
    }

}
