package sample.Model.Entities;

import sample.Model.InputKey;
import sample.Model.Level;

public class DynamicEntity implements Entity{

    private volatile Level currentMap;

    private Position position;

    public DynamicEntity(Level currentMap, Position position) {
        this.currentMap = currentMap;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Cell move(InputKey.Direction direction){
        Cell nextCell = getNextCell(direction);
        if(nextCell.isAccessible()){
            position = nextCell.getPosition();
            return nextCell;
        }
        return null;
    }

    public void setPosition(Position position) {
        this.position = position;
    }



    public Cell getNextCell(InputKey.Direction direction){
        if(direction == InputKey.Direction.Up)
            return getCell(position.getxPos()-1, position.getyPos());
        else if(direction == InputKey.Direction.Down)
            return getCell(position.getxPos()+1, position.getyPos());
        else if(direction == InputKey.Direction.Right)
            return getCell(position.getxPos(), position.getyPos()+1);
        else if(direction == InputKey.Direction.Left)
            return getCell(position.getxPos(), position.getyPos()-1);

        return null;
    }

    public Cell getCell(int xPos, int yPos){
        return currentMap.getCell(new Position(xPos, yPos));
    }




}
