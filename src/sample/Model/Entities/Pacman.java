package sample.Model.Entities;

import sample.Model.InputKey;

public class Pacman implements Cell, Entity {

    private DynamicEntity dynamicPacman;

    @Override
    public String toString() {
        return "Pacman";
    }

    @Override
    public Cell move(InputKey.Direction direction) {
        Cell newCell = move(direction);
        if(newCell != null)
        newCell.treatCollision();

    }

    @Override
    public Position getPosition() {
        return dynamicPacman.getPosition();
    }

    @Override
    public void treatCollision() {

    }

    @Override
    public boolean isAccessible() {
        return false;
    }
}
