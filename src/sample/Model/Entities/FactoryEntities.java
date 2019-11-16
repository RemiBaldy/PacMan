package sample.Model.Entities;

public class FactoryEntities {
    public enum EntityCode {Wall,FruitCell,EmptyCell,PacMan,Ghost};

    public static Cell getEntity(EntityCode entityCode){
        if(entityCode == EntityCode.EmptyCell)
            return new EmptyCell();
        if(entityCode == EntityCode.FruitCell)
            return new FruitCell();
        if(entityCode == EntityCode.Wall)
            return new Wall();
        if(entityCode == EntityCode.PacMan)
            return new Pacman();
        if(entityCode == EntityCode.Ghost)
            return new Ghost();
        return  null;
    }
}
