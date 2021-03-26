package usta.fis;

// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-March-25
// Description: This software calculate the total money saved in a year

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1;i<=12;i=i+1) {
            System.out.println("-----Month "+i+"-----");
            v_total_saved= v_total_saved+p_user_saved_money();
        }
        System.out.println("The total saved money in year is $"+v_total_saved+"");
    }
    public static void p_show_info_program() {

        // Description: This method show the info software
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Software Save Money V.1.0 ");
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Maker by: Juan Camilo Villamil Gonzalez ");
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Description: Calculate the total money saved in a year ");
        System.out.println(" -------------------------------------------------------- ");
    }
    public static int p_user_saved_money() {

        // Description: This method return the saved money in the month
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type the saved money in the month (CO)$:");
        int v_save_money = keyboard.nextInt();
        while (v_save_money<0) {
            System.err.println("ERR: You saved money can not be less than zero, type again the saved money (CO)$:");
            v_save_money = keyboard.nextInt();
        }
        return v_save_money;
    }
}
