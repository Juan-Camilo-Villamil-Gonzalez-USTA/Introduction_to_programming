package co.edu.usta.tunja.bidimensional.array.JOption;

import javax.swing.*;

public class Bidimensional {
    public static void main(String[] arrays) {
        int[][] matrix;
        int value;
        int biggestNumber, lengthBiggestNumber;
        int result=0;
        String rows, input;
        String columns = JOptionPane.showInputDialog("This program create dynamic bidimensional array, " +
                "\n type the size of the columns");
        rows = JOptionPane.showInputDialog("Type the size of the rows");

        matrix = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];

        JOptionPane.showMessageDialog(null, "Type the values " +
                "for the bidimensional array of: " + rows + " rows and " + columns + " columns");
        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                input = JOptionPane.showInputDialog("Type the value array[" + i + "] [" + j + "]=");
                value = Integer.parseInt(input);
                matrix[i][j] = value;
            }
        }

        JOptionPane.showMessageDialog(null,matrix_string_space(matrix));
    }

    public static String matrix_string_space(int [][] matrix) {
        String matrix_return="";
        int amount=0;
        int biggest_number=findBiggestValueInMatrix(matrix);
        int length_biggest_number=countDigitsNumber(biggest_number);

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                amount=length_biggest_number-countDigitsNumber(matrix[i][j]);
                matrix_return= matrix_return+ addSpaces(amount,matrix[i][j]);
            }
            matrix_return= matrix_return+ " \n ";
        }
        return matrix_return;
    }
    public static String toStringMatrix(int [][] matrix) {
        String matrix_return="";

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix_return= matrix_return+ String.valueOf(matrix[i][j]);
            }
            matrix_return= matrix_return+ " \n ";
        }
        return matrix_return;
    }

    public static int findBiggestValueInMatrix(int [][]matrix) {
        int biggest=matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggest<matrix[i][j]) {
                    biggest=matrix[i][j];
                }
            }
        }
        return biggest;
    }

    public static int countDigitsNumber(int myNumber) {
        String value= String.valueOf(myNumber);
        return value.length();
    }
}
