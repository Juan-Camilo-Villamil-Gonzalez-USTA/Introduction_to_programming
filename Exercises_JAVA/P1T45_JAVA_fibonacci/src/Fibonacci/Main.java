package Fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_series = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the quantity number of the sequence calculate");
        v_series = keyboard.nextInt();

        int array_fibonacci[] = new int[100];
        array_fibonacci = series_fibonacci(v_series);
        System.out.println("The series fibonacci for the number "+v_series+" is:");
        for (int i=0; array_fibonacci[i]>=0; i++){
            System.out.print(array_fibonacci[i]+ ", ");

        }
    }

    public static void p_show_info_program() {
        System.out.println("╔═══════════════════════════════════════════════════════════╗-");
        System.out.println("║           Author: Juan Camilo Villamil Gonzalez           ║ ");
        System.out.println("║     Description: This software is for do series fibonacci ║ ");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }

    public static int[] series_fibonacci(int v_limit) {
        int array_fibonacci[] = new int[100];
        array_fibonacci[0]=0;
        array_fibonacci[1]=1;

        for (int i = 1; (array_fibonacci[i-1]+array_fibonacci[i])<v_limit; i++) {
            array_fibonacci[i+1]= array_fibonacci[i-1]+ array_fibonacci[i];
            array_fibonacci[i+2]= -1;
        }
        return array_fibonacci;
    }
}
