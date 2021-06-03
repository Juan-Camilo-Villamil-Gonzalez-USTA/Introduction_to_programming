package co.edu.usta.tunja.triqui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        char[][] matrix;
        String choose_size_triqui;
        int size_triqui = 0;
        String rows, columns;
        JOptionPane.showMessageDialog(null, "Hi, welcome to a game of triqui");
        choose_size_triqui = JOptionPane.showInputDialog("Type the size of the triqui, choose number 1 for triqui 3x3 \n" +
                "or choose 2 for a triqui 5x5");
        size_triqui = Integer.parseInt(choose_size_triqui);
        if (size_triqui == 1) {
            JOptionPane.showMessageDialog(null, "You choose " + choose_size_triqui + ", then you play triqui 3x3");
            matrix = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i % 2 == 0)
                        matrix[i][j] = '⬜';
                    else
                        matrix[i][j] = '⬜';
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You choose " + choose_size_triqui + ", then you play triqui 5x5");
            matrix = new char[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i % 2 == 0)
                        matrix[i][j] = '⬜';
                    else
                        matrix[i][j] = '⬜';
                }
            }
        }

        int validate_player = 0;

        while (size_triqui == 1 || size_triqui==2) {
            validate_player = Integer.valueOf(JOptionPane.showInputDialog(" Type 1 to choose X or 2 to O"));


                if (validate_player == 1) {
                    showDataMatrix(matrix);
                    String row = JOptionPane.showInputDialog("Type the row you want to occupy:");
                    String column = JOptionPane.showInputDialog("Type the column you want to occupy:");
                    int rowNumber = Integer.valueOf(row);
                    int columnNumber = Integer.valueOf(column);
                    int validation = validatePosition(matrix, rowNumber, columnNumber);
                    switch (validation) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "This space is already occupied", "ERROR", JOptionPane.ERROR_MESSAGE);
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "This space not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                            break;
                        case 2:
                            matrix[rowNumber][columnNumber] = 'X';
                            break;

                    }
                }

                    if (validate_player == 2) {
                        showDataMatrix(matrix);
                        String row = JOptionPane.showInputDialog("Type the row you want to occupy:");
                        String column = JOptionPane.showInputDialog("Type the column you want to occupy:");
                        int rowNumber = Integer.valueOf(row);
                        int columnNumber = Integer.valueOf(column);
                        int validation = validatePosition(matrix, rowNumber, columnNumber);
                        switch (validation) {
                            case 0:
                                JOptionPane.showMessageDialog(null, "This space is already occupied", "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, "This space not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
                                break;
                            case 2:
                                matrix[rowNumber][columnNumber] = 'O';
                                break;

                        }
                    }
            showDataMatrix(matrix);
                    }
            }

    public static int validatePosition(char[][] matrix, int row, int column) {
        if (row >= matrix.length || column >= matrix[0].length) {
            return 1;
        }
        if (matrix[row][column] == 'O'){
            return 0;
        }
        if (matrix[row][column] == 'X') {
            return 0;
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

