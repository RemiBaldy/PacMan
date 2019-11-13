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

        loadGrid(scanner);
    }
    private void loadGrid(Scanner scanner) {
        grid = new int[rows][columns];
        scanner.reset();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
    }

    private void countColumnsAndRows(Scanner scanner, BufferedReader lineReader) {
        try {
            String line = lineReader.readLine();
            columns = line.length();
            lineReader.close();

            while(scanner.hasNextLine())
                rows++;

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Level{" +
                "grid=" + Arrays.toString(grid) +
                '}';
    }
}

