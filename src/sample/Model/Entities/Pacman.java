package sample.Model.Entities;

import sample.Model.InputKey;

public class Pacman implements Cell, Entity {

    private DynamicEntity dynamicPacman;

    public Pacman(DynamicEntity dynamicPacman) {
        this.dynamicPacman = dynamicPacman;
    }

    @Override
    public String toString() {
        return "P";
    }

    @Override
    public Cell move(InputKey.Direction direction) {
        Cell newCell = dynamicPacman.move(direction);
        if(newCell != null){
            Collision.treatCollision(this,newCell);
            ((Consumable)newCell).use();
            return newCell;
        }
        return null;
    }

    @Override
    public Position getPosition() {
        return dynamicPacman.getPosition();
    }


    @Override
    public boolean isAccessible() {
        return false;
    }
}
