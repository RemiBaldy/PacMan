package sample.Model.Entities;


import javafx.util.Pair;

public interface Cell {
    Position getPosition();
    void treatCollision();
    boolean isAccessible();
}
