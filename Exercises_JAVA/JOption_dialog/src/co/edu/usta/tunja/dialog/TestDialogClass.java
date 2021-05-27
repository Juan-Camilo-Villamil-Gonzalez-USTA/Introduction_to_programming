package co.edu.usta.tunja.dialog;

import javax.swing.*;

public class TestDialogClass {
    public static void main(String [] args) {

        String answer;
        int amount = 0, operation = 0;
        int[] array;
        double result = 0;

        array = new int[amount];
        JOptionPane.showMessageDialog(null, "This program make calculator operations");
        answer = JOptionPane.showInputDialog("Choose a operation when: \n" +
                "1 for sum\n" +
                "2 for subtraction\n " +
                "3 for multiplication\n " +
                "4 for division");
        operation = Integer.valueOf(answer);
        if (operation > 0 && operation < 5) {
            answer = JOptionPane.showInputDialog("Type the amount of numbers will you use");
            amount = Integer.valueOf(answer);
            array = new int[amount];

            for (int i = 0; i < amount; i++) {
                answer = JOptionPane.showInputDialog("The value of the " + (i + 1) + " number");
                array[i] = Integer.valueOf(answer);
            }
            result = calculator(array, operation);
        } else{
            array = new int[2];
        answer= JOptionPane.showInputDialog("Type the value of the first number");
        array[0]=Integer.valueOf(answer);
        answer= JOptionPane.showInputDialog("Type the value of the second number");
        array[1]=Integer.valueOf(answer);
        result = calculator(array, operation);
    }
        JOptionPane.showMessageDialog(null, "The answer for you operation is: "+result);
    }
    public static double calculator(int[] array, int operation){
        double result=0;
        switch (operation) {
            case 1:
                for (int i=0; i<array.length; i++) {
                    result= (result+array[i]);
                }
                return result;
            case 2:
            for (int i=0; i<array.length; i++) {
                result= (array[0]-array[1]);
            }
            return result;
            case 3:
                result=1;
                for (int i=0; i<array.length; i++) {
                    result= (result*array[i]);
                }
                return result;
            case 4:
                result= (double) array[0]/ (double) array[1];
                return result;
        }
        return result;
    }
}
