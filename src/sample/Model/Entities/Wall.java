package sample.Model.Entities;

public class Wall implements Cell {
    Position position;

    public Wall(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public String toString() {
        return "W";
    }
}
