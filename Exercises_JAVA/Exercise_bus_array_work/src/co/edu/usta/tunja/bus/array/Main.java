package co.edu.usta.tunja.bus.array;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] matrix;
        String rows;
        JOptionPane.showMessageDialog(null, "Hi, the bus have a number of 4 columns");
        rows = JOptionPane.showInputDialog("Type the size of the rows");
        matrix = new char[Integer.parseInt(rows)][4];


        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0)
                    matrix[i][j] = 'D';
                else
                    matrix[i][j] = 'X';
            }
        }
        int option = 0;
        do {
            showDataMatrix(matrix);
            option = Integer.valueOf(JOptionPane.showInputDialog(" Type 1 to sum passenger or 2 to exit"));
            if (option == 1) {
                String row = JOptionPane.showInputDialog("Type the row you want to occupy:");
                String column = JOptionPane.showInputDialog("Type the column you want to occupy:");
                int rowNumber = Integer.valueOf(row);
                int columnNumber = Integer.valueOf(column);
                int validation = validatePassegerPosition(matrix, rowNumber, columnNumber);
                switch (validation) {
                    case -1:
                        JOptionPane.showMessageDialog(null, "This place is taken", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "The position does not exist");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "This place cannot be used", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 2:
                        matrix[rowNumber][columnNumber] = 'O';
                        break;

                }
            }
        } while (option == 1);
        JOptionPane.showMessageDialog(null, "These are the positions of the seats on the bus:");

    }

    public static int validatePassegerPosition(char[][] matrix, int row, int column) {
        if (row >= matrix.length || column >= matrix[0].length) {
            return 0;
        }
        if (matrix[row][column] == 'O') {
            return -1;
        }
        if (matrix[row][column] == 'X') {
            return 1;
        }
        return 2;
    }

    public static void showDataMatrix(char[][] matrix) {
        String matrixInString = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                matrixInString += matrix[i][j] + " ";
            }
            matrixInString += "\n";
        }
        JOptionPane.showMessageDialog(null, matrixInString);
    }
}

