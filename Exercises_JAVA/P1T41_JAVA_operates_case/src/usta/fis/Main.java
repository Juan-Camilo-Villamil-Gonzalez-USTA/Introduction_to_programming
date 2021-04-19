package usta.fis;
// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-April-16
// Description: This software is for a homework

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int v_first_n = 0;
        int v_second_n = 0;
        int v_operation = 0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        do {
            //data read
            System.out.println("Type the first number");
            v_first_n = keyboard.nextInt();
            System.out.println("Type the second number");
            v_second_n = keyboard.nextInt();
            System.out.println("Type the number 1 for sum, 2 for subtraction, 3 for multiplication, 4 for division, 5 for prime numbers and 0 for exit");
            v_operation = keyboard.nextInt();
            //operate and show the results
            System.out.println("The result is " + p_operate_numbers(v_first_n, v_second_n, v_operation));

        } while (v_operation != 0);
    }

    private static void p_show_info_program() {
        System.out.println("The result is / Author: Juan Camilo Villamil Gonzalez" +
                        "Date: 2021-April-16"+
                "Description: This software is for a homework");
    }

    private static int p_operate_numbers(int v_first_n, int v_second_n, int v_operation) {
        switch (v_operation) {
            case 1:
                return v_first_n + v_second_n;
            case 2:
                return v_first_n - v_second_n;
            case 3:
                return v_first_n * v_second_n;
            case 4:
                return v_first_n / v_second_n;
        }
        return v_first_n;
    }
}