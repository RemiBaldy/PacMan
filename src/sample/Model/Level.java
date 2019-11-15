package sample.Model;

import sample.Model.Entities.Cell;
import sample.Model.Entities.Entity;
import sample.Model.Entities.FactoryEntities;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static sample.Model.Entities.FactoryEntities.*;

public class Level {
    int columns;
    int rows;
    Entity[][] grid;

    public Level(File file) {
        columns = 0;
        rows = 0;

        Scanner scanner = null;
        BufferedReader lineReader = null;

        try {
            scanner = new Scanner(file);
            lineReader = new BufferedReader(new FileReader(file));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert scanner != null;
        assert lineReader != null;

        countColumnsAndRows(scanner, lineReader);

        loadGrid(file);

        System.out.println(this);
    }

    private void loadGrid(File file) {
        grid = new Entity[rows][columns];
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(scanner.hasNextInt()){
                    grid[i][j] = getEntity(EntityCode.values()[scanner.nextInt()]);
                }
            }
            if(scanner.hasNextLine())
                scanner.nextLine();
        }
    }

    private void countColumnsAndRows(Scanner scanner, BufferedReader lineReader) {
        try {
            String line = lineReader.readLine();
            Scanner lineScan = new Scanner(line);

            while(lineScan.hasNextInt()){
                lineScan.nextInt();
                columns++;
            }
            lineScan.close();
            lineReader.close();

            while(scanner.hasNextLine()) {
                scanner.nextLine();
                rows++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Entity[] T : grid){
            s.append("\n");
            for(Entity elt: T)
                s.append(" ").append(elt.toString());
        }
        return "Level{" +
                "columns=" + columns +
                ", rows=" + rows +
                ", grid=" + s +
                '}';
    }

    public Entity getCell(int xPos, int yPos) {
        return grid[xPos][yPos];
    }
}

