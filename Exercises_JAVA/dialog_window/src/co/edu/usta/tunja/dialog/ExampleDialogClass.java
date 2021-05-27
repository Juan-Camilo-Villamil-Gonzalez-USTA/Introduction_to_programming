package co.edu.usta.tunja.dialog;

import javax.swing.*;

public class ExampleDialogClass {
    public static void main(String [] args) {
        // EJEMPLOS DE JOption
        // EJEMPLO 1
        JOptionPane.showMessageDialog(null, "\n" +
                "\t\t                       Author: Juan Camilo Villamil Gonzalez                    \n" +
                "\t\t               Description: This software is for examples of JOption          \n");
        //EJEMPLO 2
        JOptionPane.showMessageDialog(null, "ERR: Type again", "ERROR", JOptionPane.WARNING_MESSAGE);
        // EJEMPLO 3
        JOptionPane.showMessageDialog(null, "ERR: You type wrong your name", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        // EJEMPLO 4
        JOptionPane.showMessageDialog(null, "ERR: Type again", "ERROR", JOptionPane.QUESTION_MESSAGE);
        // EJEMPLO 5
        JOptionPane.showMessageDialog(null, "ERR: Type again", "ERROR", JOptionPane.PLAIN_MESSAGE);
        // EJEMPLO 6
        JOptionPane.showMessageDialog(null, "ERR: Type again", "ERROR", JOptionPane.ERROR_MESSAGE);
        // EJEMPLO 7
        String ans = JOptionPane.showInputDialog("Type your name");
        // EJEMPLO 8
        String name = JOptionPane.showInputDialog("¿Whats your name?", "Juan Camilo");
        // EJEMPLO 9
        String err = JOptionPane.showInputDialog(null, "Type again your name", "Error!", JOptionPane.ERROR_MESSAGE);
        // EJEMPLO 10
        int resp = JOptionPane.showConfirmDialog(null, "¿Are you sure?");
        // EJEMPLO 11
        int alert = JOptionPane.showConfirmDialog(null, "¿Are you sure?", "Alert!", JOptionPane.YES_NO_OPTION);
        // EJEMPLO 12
        int answer = JOptionPane.showConfirmDialog(null, "¿Are you sure?", "Alert!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);


    }
}
