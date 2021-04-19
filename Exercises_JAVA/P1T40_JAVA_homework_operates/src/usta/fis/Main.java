package usta.fis;

// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-April-16
// Description: This software is for a homework


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int v_number1, v_number2, v_operation;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the first number");
        v_number1 = keyboard.nextInt();
        System.out.println("Type the second number");
        v_number2 = keyboard.nextInt();
        System.out.println("Press in the number 1 to 4 to show the results");
        v_operation = keyboard.nextInt();
        while (v_operation < 1 || v_operation > 4)
        {
            System.err.println("ERR: The option enter is not valid, try again");
            v_operation = keyboard.nextInt();
        }
        {
            if (v_operation == 1);{
            System.out.println("The total sum is");
            System.out.println(v_number1 + v_number2);
        }
        }
        {
            if (v_operation == 2);{
            System.out.println("The total subtraction is");
            System.out.println(v_number1 - v_number2);
        }
        }
        {
            if (v_operation == 3);{
            System.out.println("The total multiplication is");
            System.out.println(v_number1 * v_number2);
        }
        }
        {
            if (v_operation == 4);{
            System.out.println("The total division is");
            System.out.println(v_number1 / v_number2);
        }
        }
        }
    }
