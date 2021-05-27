package co.edu.usta.tunja.calculator2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int v_number1=0;
        int v_number2=0;
        int v_total=0; //v_total=result
        int v_operation=0; //To choose the number as a sum, subtract
        p_show_info_program();
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Type the number 1 for sum, 2 for subtraction, 3 for multiplication, 4 for division, 5 for prime numbers, 6 for calculate the prime numbers above and 0 for exit");
        v_operation = keyboard.nextInt();
        if (v_operation>0) {
            System.out.println("Type the first number");
            v_number1 = keyboard.nextInt();
        }
        if (v_operation>0&&v_operation<5) {
            System.out.println("Type the second number");
            v_number2 = keyboard.nextInt();
        }
        v_total=operations_calculator(v_number1, v_number2, v_operation);
        System.out.println("The result is: "+v_total);

    }

    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     Author: Juan Camilo Villamil Gonzalez                    ║");
        System.out.println("║               Description: This software is for do a calculator,             ║");
        System.out.println("║       make sum, subtraction, multiplication and divide 2 numbers integer     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
    }

    public static int operations_calculator(int v_number1, int v_number2, int v_operation) {
        if (v_operation == 1) {
            return v_number1 + v_number2;
        }
        if (v_operation == 2) {
            return v_number1 - v_number2;
        }
        if (v_operation == 3) {
            return v_number1 * v_number2;
        }
        if (v_operation == 4&&v_number2!=0) {
            return v_number1 / v_number2;
        }
        if (v_operation == 5) {
            return v_number1;
        }
        return 0;
    }
}

