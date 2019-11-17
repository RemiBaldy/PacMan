package sample.Model.Entities;

import javafx.util.Pair;

public class FruitCell implements Cell, Consumable {
    Position position;

    public FruitCell(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void use() {

    }

    @Override
    public boolean isAccessible() {
        return true;
    }

    @Override
    public String toString() {
        return "F";
    }
}
