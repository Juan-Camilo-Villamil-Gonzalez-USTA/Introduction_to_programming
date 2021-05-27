package co.edu.usta.tunja.array2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	p_show_info_program();
	int counter=0;
	int array_V1[]= new int[5];
	Scanner keyboard= new Scanner(System.in);

	System.out.println("Type 5 values to the array");
	for (int i=0; i<array_V1.length; i++) {
		System.out.println("Type value " + (i + 1));
	    array_V1[i]= keyboard.nextInt();
		while (array_V1[i]%2==0){
			System.err.println("This number is not odd, type again");
			array_V1[i]= keyboard.nextInt();
		}
    }
		for (int i=0; i<array_V1.length; i++) {
			System.out.println("The value is: " +array_V1[i]);
		}
    }

	public static void p_show_info_program() {
		System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗-");
		System.out.println("║                     Author: Juan Camilo Villamil Gonzalez                    ║ ");
		System.out.println("║               Description: This software is for write numbers odds           ║ ");
		System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
	}
}
