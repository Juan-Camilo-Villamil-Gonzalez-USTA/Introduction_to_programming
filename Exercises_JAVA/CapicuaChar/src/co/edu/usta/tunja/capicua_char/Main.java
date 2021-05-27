package co.edu.usta.tunja.capicua_char;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter=0;
        char charArray;
        String cadena=" ";
        //p_show_info_program();
        Scanner keyboard= new Scanner(System.in);
        cadena= keyboard.next();
        capicuaMethod(cadena);

    }

    public static void p_show_info_program() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════╗-");
        System.out.println("║                              Author: Juan Camilo Villamil Gonzalez                 ║ ");
        System.out.println("║               Description: This software is for show info about capicua letters    ║ ");
        System.out.println("║                       or number with limit 10 characters, ENTER to end             ║ ");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════╝");
    }

    public static boolean capicuaMethod(String cadena){
        char []charArray;
        charArray= new char[cadena.length()];
        charArray= cadena.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if (charArray[i]!=charArray[charArray.length-(1+i)]){
                return false;
            }
        }
        return true;
    }
}
