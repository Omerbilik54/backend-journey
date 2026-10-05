package week8_finish_project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner scan = new Scanner(System.in);

    int row;//satır sayısı
    int col;//sütun sayısı
    String[][] mineMap;
    String[][] gameMap;
    int mineCount;

    public MineSweeper() {
        readDimension();
        mineCount = row * col / 4;
        mineMap = new String[row][col];
        gameMap = new String[row][col];
        fillBoard(mineMap);
        fillBoard(gameMap);
        placeMines();

    }

    public void printBoard(String[][] board) {//tamam
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "-";
            }
        }
    }

    public boolean isInBounds(int input_row, int input_col) {//tamam
        if (input_row < 0 || input_row >= row) {
            return false;
        }
        if (input_col < 0 || input_col >= col) {
            return false;
        }
        return true;
    }

    // Satır ve sütun için aynı kodu iki kez yazmamak için tek metot
    public int readSize(String name) {
        System.out.println(name + " sayısını giriniz :");
        int value = scan.nextInt();
        while (value < 2) {
            System.out.println(name + " sayısı 2'den az olamaz. Tekrar deneyiniz :");
            value = scan.nextInt();
        }
        return value;
    }

    public void readDimension() {
        row = readSize("Satır");
        col = readSize("Sütun");
    }


    public void placeMines() {
        Random rand = new Random();
        int mineCount = row * col / 4;
        int placed = 0;
        while (placed < mineCount) {
            int randomRow = rand.nextInt(row);
            int randomCol = rand.nextInt(col);
            if (mineMap[randomRow][randomCol].equals("-")) {
                mineMap[randomRow][randomCol] = "*";
                placed++;
            }
        }

    }

    public int countNeighborMines(int r, int c) {
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (isInBounds(i, j) && mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }

    public void play() {
        int safeCells = row * col - mineCount;
        int opened = 0;

        while (true) {
            printBoard(gameMap);

            System.out.println("Satır giriniz :");
            int r = scan.nextInt();
            System.out.println("Sütun giriniz :");
            int c = scan.nextInt();

            if (!isInBounds(r, c)) {
                System.out.println("Geçersiz koordinat! Tahtanın içinde bir nokta girin.");
                continue;
            }
            if (!gameMap[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }
            if (mineMap[r][c].equals("*")) {
                System.out.println("Mayına bastınız, oyunu kaybettiniz!");
                printBoard(mineMap);
                return;
            }

            gameMap[r][c] = String.valueOf(countNeighborMines(r, c));
            opened++;

            if (opened == safeCells) {
                printBoard(gameMap);
                System.out.println("Tebrikler, tüm kutuları açtınız, oyunu kazandınız!");
                return;
            }
        }
    }
}
