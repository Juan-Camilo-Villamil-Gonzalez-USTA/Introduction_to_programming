package usta.fis;

// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-March-23
// Description: This software calculate the average height of five children

import java.util.Scanner;

public class Main<v_average> {

    public static void main(String[] args) {
        p_show_info_program();
        int v_average=0;
        int v_sum=0;
        for (int i = 1; i <=5; i = i + 1) {
            System.out.println("-----Children " + i + "-----");
            v_sum=v_sum+p_children_height();
            v_average=v_sum/5;
        }
        System.out.println("The average height of the children is "+v_average+"");
    }

    public static void p_show_info_program() {
        // Description: This method show the info software
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" Software average height V.1.0 ");
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" Maker by: Juan Camilo Villamil Gonzalez ");
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" Description: Calculate the average height of five children ");
        System.out.println(" -------------------------------------------------------------- ");
    }

    public static int p_children_height() {

        // Description: This method return the height of the children
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type the height of the children:");
        int v_height = keyboard.nextInt();
        while (v_height < 50 || v_height > 220) {
            System.err.println("ERR: The height not be less tan 50 cm or greater than 220 cm, type again the height :");
            v_height = keyboard.nextInt();
        }
        return v_height;
    }

    }