package usta.fis;

// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-March-23
// Description: This software calculate the time in cycle between two cities

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        float v_time = 0;
        v_time = v_distance/v_velocity;
        System.out.println("The time between two cities is "+v_time+" hours");
    }

    public static void p_show_info_program() {
        // Description: This method show the info software
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Software Time cycle V.1.0 ");
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Maker by: Juan Camilo Villamil Gonzalez ");
        System.out.println(" --------------------------------------------------------");
        System.out.println(" Description: Calculate time between two cities ");
        System.out.println(" -------------------------------------------------------- ");
    }

    public static int p_user_distance() {
        // Description: This method return the distance than user type
        Scanner keyboard = new Scanner(System.in);
        int v_distance;
        System.out.println(" Type distance (Km) between the two cities ");
        v_distance = keyboard.nextInt();
        while (v_distance < 0) {
            System.err.println(" ERR: The distance should be greater than zero, type again the distance between the two cities");
            v_distance = keyboard.nextInt();
        }
        return v_distance;
    }
    public static int p_user_velocity() {
        // Description: This method return the velocity than user type
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Type the constance velocity (Km/H) of the cycle ");
        int v_velocity = keyboard.nextInt();
        while (v_velocity == 0) {
            System.err.println(" ERR: The velocity is not valid, the velocity can not be equal than zero, type again the velocity (Km/H) ");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}
