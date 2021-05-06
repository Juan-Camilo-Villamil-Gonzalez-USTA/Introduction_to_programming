package co.usta.edu.arrays;

// Author: Juan Camilo Villamil Gonzalez
// Date: 2021-April-16
// Description: This software is for a homework

public class ArraysExample {
    public static void main(String[] args) {
        int [] p_array_vector= new int[100];
        int counter=0;
        int v_total=0;

        p_array_vector[0]=4;
        p_array_vector[1]=5;
        p_array_vector[2]=2;

        for (counter = 0; counter < p_array_vector.length; counter++) {
            System.out.println("Your qualifications"+counter+1+" is "+p_array_vector[counter]);
        }
        //v_total=p_array_vector[]
    }
}
