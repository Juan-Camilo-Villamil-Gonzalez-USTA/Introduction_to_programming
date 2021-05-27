package co.edu.usta.tunja.capicua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int []array= new int [100];
        Scanner keyboard = new Scanner(System.in);
        int digit=0, counter=0;

        System.out.println("Type the number to verification if is capicua");
        do{
            System.out.println("");
            digit= keyboard.nextInt();
            array[counter]=digit;
            counter++;
        }
        while (digit!=-1);
        counter--;
        if (verifyCapicua(array,counter)){
            System.out.println("The number is capicua");
        } else {
            System.out.println("The number NOT is capicua");
        }
    }
    public static boolean verifyCapicua(int []array, int size){
        for (int i=0; i<size; i++){
            if (array[size-(i+1)]!=array[i]){
                return false;
            }
        }
        return true;
    }
}
