package sample.Model.Entities;

import javafx.util.Pair;
import sample.Model.InputKey;
import sample.Model.Level;

public class DynamicEntity implements Entity{



    private volatile Level currentMap;

    private Pair<Integer, Integer> position;

    public void move(InputKey.Direction direction){
        Cell nextCell = getNextCell(direction);
        if(nextCell.isAccessible()){
            nextCell.treatCollision();
        }
    }

    public Cell getNextCell(InputKey.Direction direction){
        if(direction == InputKey.Direction.Up)
            return currentMap.getCell(getXPos()+1, getYPos());
        else if(direction == InputKey.Direction.Down)
            return currentMap.getCell(getXPos()-1, getYPos());
        else if(direction == InputKey.Direction.Right)
            return currentMap.getCell(getXPos(), getYPos()+1);
        else if(direction == InputKey.Direction.Left)
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
