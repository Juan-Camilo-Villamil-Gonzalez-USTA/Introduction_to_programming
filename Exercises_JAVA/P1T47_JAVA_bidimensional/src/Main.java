import java.util.*;

public class Main {

    public static void main(String[] args) {

        final int ROWS = 5, COLUMNS = 4;
        Scanner keyboard = new Scanner(System.in);
        int i, j;// mayor, menor;
        //int filaMayor, filaMenor, colMayor, colMenor;

        int[][] array_bidimensional = new int[ROWS][COLUMNS];
        System.out.println("Reading elements from the array: ");
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLUMNS; j++) {
                System.out.print("array_bidimensional[" + i + "][" + j + "]= ");
                array_bidimensional[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Entered values:");
        for (i = 0; i < array_bidimensional.length; i++) {
            for (j = 0; j < array_bidimensional[i].length; j++) {
                System.out.print(array_bidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}