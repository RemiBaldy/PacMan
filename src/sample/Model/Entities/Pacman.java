package sample.Model.Entities;

import sample.Model.InputKey;

public class Pacman implements Cell, Entity {
    @Override
    public void treatCollision() {

    }

    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public String toString() {
        return "Pacman";
    }

    @Override
    public void move(InputKey.Direction direction) {

    }
}
