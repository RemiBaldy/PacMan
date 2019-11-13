package sample.Model;

import java.io.File;

public class Model {

    private int[][] grid;
    Level level;

    public Model() {
        this.initializeLevel();
    }

    private void initializeLevel() {
        level = new Level(new File("/levels/level1.txt"));
        System.out.println(level);
    }
}

