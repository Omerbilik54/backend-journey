package week8_finish_project;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {

    Scanner scan = new Scanner(System.in);

    int input_row;
    int input_col;
    int row;//satır sayısı
    int col;//sütun sayısı
    String[][] mineMap;
    String[][] gameMap;

    public MineSweeper() {
        readDimension(row, col);
        mineMap = new String[row][col];
        gameMap = new String[row][col];

        printBoard();

    }

    public void printBoard() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }


    }

    public boolean isInBounds(int input_row, int input_col, int row, int col) {
        if (input_row < 0 || input_row >= row) {
            return false;
        }

        if (input_col < 0 || input_col >= col) {
            return false;
        }
        return true;

    }

    public void readDimension(int row, int col) {
        System.out.println("Satır sayısını giriniz :");
        row = scan.nextInt();
        while (row < 2) {
            System.out.println("Satır sayısı 2'den az olamaz . Tekrar deneyiniz :");
            row = scan.nextInt();
        }
        this.row = row;
        System.out.println("Sütun sayısını giriniz :");
        col = scan.nextInt();
        while (col < 2) {
            System.out.println("Sütun sayısı 2'den az olamaz . Tekrar deneyiniz :");
            col = scan.nextInt();
        }
        this.col = col;

    }


    public void placeMines() {

    }


}
