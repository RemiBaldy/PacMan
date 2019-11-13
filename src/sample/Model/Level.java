package sample.Model;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Level {
    int columns;
    int rows;
    int[][] grid;

    public Level(File file) {
        columns = 0;
        rows = 1;

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
        for(int[] T : grid){
            for(int elt: T)
                System.out.println(elt);
        }
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
            if(scanner.hasNext())
            for (int j = 0; j < columns; j++) {

                if(scanner.hasNextLine()){

                    grid[i][j] = scanner.nextInt();
                    System.out.println(grid[i][j]);
                }
            }
        }
    }

    private void countColumnsAndRows(Scanner scanner, BufferedReader lineReader) {
        try {
            String line = lineReader.readLine();
            columns = line.length();
            lineReader.close();

            while(scanner.hasNextLine()) {
                scanner.nextLine();
                rows++;
            }
            System.out.println("titi");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public String toString() {
        String s = "";
        for(int[] T : grid){
            for(int elt: T)
                s = s + " " + elt;
        }
        return "Level{" +
                "grid=" + s +
                '}';
    }
}

