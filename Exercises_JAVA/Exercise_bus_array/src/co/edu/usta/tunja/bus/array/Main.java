package co.edu.usta.tunja.bus.array;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] matrix;
        int value = 0;
        int columns = 4;

        String rows, input;
        JOptionPane.showMessageDialog(null, "Hi, the bus have a number of 4 columns");
        rows = JOptionPane.showInputDialog("Type the size of the rows");
        matrix = new int[Integer.parseInt(rows)][columns];

        JOptionPane.showMessageDialog(null, "Choose a place " +
                "" + rows + " rows and " + columns + " columns");

        for (int i = 0; i < columns; i++) {
            for (int j = 0; i < Integer.parseInt(rows); i++) {
                if (value % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "The place is: [" +i+ "] [" +j+ "] = D");
                } else if (value % 2 == 1) {
                    JOptionPane.showMessageDialog(null, "The place is: [" +i+ "] [" +j+ "] = X");
                }
            }
        }
        input = JOptionPane.showInputDialog("Choose your place in the bus");
        value = Integer.parseInt(input);

        if (value % 2 == 1) {
            JOptionPane.showMessageDialog(null, "This place cannot be used", "ERROR", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showInputDialog("Choose again your place:");
        } else if (value % 2 == 0) {
            JOptionPane.showMessageDialog(null, "This place can be used");
        }
    }
}
