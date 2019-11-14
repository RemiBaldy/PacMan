package sample.Model;

import sample.Model.Entities.Cell;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Level {
    int columns;
    int rows;
    int[][] grid;

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

    // METHODE LOADGRID A CHANGER  -- Observation log : 13112019 18:01 - Youssef
    private void loadGrid(File file) {
        grid = new int[rows][columns];
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(scanner.hasNextInt()){
                    grid[i][j] = scanner.nextInt();
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
        for(int[] T : grid){
            s.append("\n");
            for(int elt: T)
                s.append(" ").append(elt);
        }
        return "Level{" +
                "columns=" + columns +
                ", rows=" + rows +
                ", grid=" + s +
                '}';
    }

    public Cell getCell(int xPos, int yPos) {

    }
}

