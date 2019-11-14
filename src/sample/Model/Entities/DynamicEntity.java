package sample.Model.Entities;

import javafx.util.Pair;
import sample.Model.Level;

public class DynamicEntity {

    private enum Direction {Up,Down,Left,Right};

    private volatile Level currentMap;

    private Pair<Integer, Integer> position;

    public void move(Direction direction){
        Cell nextCell = getNextCell(direction);
        if(nextCell.isAccessible()){
            nextCell.treatCollision();
        }
    }

    public Cell getNextCell(Direction direction){
        if(direction == Direction.Up)
            return currentMap.getCell(getXPos()+1, getYPos());
        else if(direction == Direction.Down)
            return currentMap.getCell(getXPos()-1, getYPos());
        else if(direction == Direction.Right)
            return currentMap.getCell(getXPos(), getYPos()+1);
        else if(direction == Direction.Left)
            return currentMap.getCell(getXPos(), getYPos()-1);

        return null;
    }

    public int getXPos(){
        return position.getKey();
    }
    public int getYPos() {
        return position.getValue();
    }



}
