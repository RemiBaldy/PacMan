package sample.Model.Entities;

public class Ghost implements Cell {
    @Override
    public void treatCollision() {

    }

    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public String toString() {
        return "Ghost";
    }
}
