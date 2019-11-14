package sample.Model;

import java.io.File;

public class Model {

    private int[][] grid;
    private Level level;

    public Model() {
        this.initializeLevel();
    }

    private void initializeLevel() {
        level = new Level(new File("src/levels/level1.txt"));
    }
}

