package sample.Model.Entities;

public class Wall implements Cell {
    Position position;

    @Override
    public Position getPosition() {
        return null;
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
        return "Wall";
    }
}
