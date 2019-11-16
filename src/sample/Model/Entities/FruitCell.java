package sample.Model.Entities;

import javafx.util.Pair;

public class FruitCell implements Cell {
    Position position;

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void treatCollision() {

    }

    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public String toString() {
        return "FruitCell";
    }
}
