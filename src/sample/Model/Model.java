package sample.Model;

import java.io.File;

public class Model {

    private int[][] grid;
    Level level;

    public Model() {
        this.initializeLevel();
    }

    private void initializeLevel() {
        System.out.println("toto");
        level = new Level(new File("src/levels/level1.txt"));
        System.out.println(level);
    }
}

