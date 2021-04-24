package usta.fis;
// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-April-16
// Description: This software is for a homework

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int v_number1 = 0;
        int v_number2 = 0;
        int v_operation = 0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);

        do {
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
            System.out.println("The result is " + p_operate_numbers(v_number1, v_number2, v_operation));

        } while (v_operation != 0);
    }

    private static void p_show_info_program() {
        System.out.println("Author: Juan Camilo Villamil Gonzalez");
        System.out.println("Description: This software is for a do operations");
    }

    public static String p_operate_numbers(int v_number1, int v_number2, int v_operation) {
        int v_result=0;
        String v_convert="";
        switch (v_operation){
            case 1:
                v_result=v_number1+v_number2;
                break;
            case 2:
                v_result=v_number1-v_number2;
                break;
            case 3:
                v_result=v_number1*v_number2;
                break;
            case 4:
                v_result=v_number1/v_number2;
                break;
            case 5:
                v_convert = "NOT is a prime number";
                if(p_validate_prime(v_number1)){
                    v_convert = "a prime number";
                }
                break;
            case 6:
                v_convert= "the prime numbers above are: "+p_prime_numbers(v_number1);
                break;
            default:
                v_convert="EXIT";
                System.exit(0);
        }
        if (v_convert.isEmpty()){
            v_convert=String.valueOf(v_result);
        }
        return v_convert;
    }

    public static String p_prime_numbers(int v_limit) {
        String prime_numbers="";
        for (int counter = 1; counter < v_limit; counter++) {
            if (p_validate_prime(counter)) {
                prime_numbers=prime_numbers+String.valueOf(counter)+",";
            }
        }
        return prime_numbers;
    }

    public static boolean p_validate_prime(int v_prime){
        int numbers_divide=0;
        for (int i=1;i<=v_prime;i++) {
            if (v_prime%i ==0) {
                numbers_divide++;
            }
        }
        if (numbers_divide!=2){
            return false;
        }
        return true;
    }
}