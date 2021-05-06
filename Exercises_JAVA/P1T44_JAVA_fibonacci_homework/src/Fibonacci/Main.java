package Fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_series = 0;
        int v_number1 = 0;
        int v_number2 = 1;
        int v_sum = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the quantity number of the sequence calculate");
        v_series = keyboard.nextInt();

        int array_fibonacci[] = new int[v_series];
        array_fibonacci[0] = v_number1;
        array_fibonacci[1] = v_number2;
        System.out.println("The series fibonacci for the number "+v_series+" is:");


        for (int i = 1; i < v_series; i++) {
            System.out.print(v_sum+", ");
            v_sum = v_number1+v_number2;
            v_number1 = v_number2;
            v_number2 = v_sum;
        }
    }

    public static void p_show_info_program() {
        System.out.println("╔═══════════════════════════════════════════════════════════╗-");
        System.out.println("║           Author: Juan Camilo Villamil Gonzalez           ║ ");
        System.out.println("║     Description: This software is for do series fibonacci ║ ");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }

    public static int[] series_fibonacci(int v_limit) {
        int array_fibonacci[] = new int[v_limit];

        for (int i = 1; i < v_limit; i++) {
            array_fibonacci[i + 1] = array_fibonacci[i - 1] + array_fibonacci[i];
        }
        return array_fibonacci;
    }
}
