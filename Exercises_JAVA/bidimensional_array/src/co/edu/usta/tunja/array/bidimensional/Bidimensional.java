package co.edu.usta.tunja.array.bidimensional;

import java.util.Scanner;

public class Bidimensional {
    public static void main(String [] params) {
        int rows=5, columns=4;
        Scanner keyboard= new Scanner(System.in);
        int [][] matrix=new int[rows][columns];

        System.out.println("Type the value for the bidimensional array (matrix)");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println("This value will locate in matrix["+i+"]["+j+"]=");
                matrix[i][j]=keyboard.nextInt();
            }
        }
        System.out.println("\n The values in order of the matrix are: \n");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print(" "+matrix[i][j]+" ");
                if (matrix[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.print("");
        }
    }
}
