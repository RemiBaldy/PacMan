package sample.Model;

import sample.Model.Entities.Pacman;

import java.io.File;

public class Model {

    private int[][] grid;
    private Level level;
    private Pacman pacman;

    public Model() {
        this.initializeLevel();
    }

    private void initializeLevel() {
        level = new Level(new File("src/levels/level1.txt"));
    }

    public Pacman getPacman() {
        return pacman;
    }
}

