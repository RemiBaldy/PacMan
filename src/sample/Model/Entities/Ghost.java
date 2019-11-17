package sample.Model.Entities;

import sample.Model.InputKey;

public class Ghost implements Cell, Entity{

    DynamicEntity dynamicGhost;


    @Override
    public String toString() {
        return "G";
    }

    @Override
    public Position getPosition() {
        return dynamicGhost.getPosition();
    }

    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public Cell move(InputKey.Direction direction) {
        return null;
    }
}
