package co.edu.usta.tunja.single_array_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] mySingleArray;
        int v_size = 0;
        int i = 0;
        int v_grade = 0;
        float average_result;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the size of the single array");
        v_size = keyboard.nextByte();
        mySingleArray = new int[v_size];

        System.out.println("Type the grades that you know the average");

        while (i < mySingleArray.length) {
            System.out.println("Type the " + (i + 1) + " grade:");
            v_grade = keyboard.nextInt();
            mySingleArray[i] = v_grade;
            i++;
        }
        average_result= calculateAverage(mySingleArray);
        for (int j=0; j<mySingleArray.length;j++){
            System.out.println("Your note is: "+mySingleArray[j]+ ", ");
        }
        System.out.println("Your sum grades is: "+summary(mySingleArray));
        System.out.println("Your average grades is: "+average_result);
    }
    public static int summary(int []mySingleArray){
        int counter=0, v_sum=0;
        while (counter<mySingleArray.length){
            v_sum= v_sum+mySingleArray[counter];
            counter++;
        }
        return v_sum;
    }
    public static float calculateAverage(int [] mySingleArray){
        int v_sum=0;
        float average;
        v_sum= summary(mySingleArray);

        average= v_sum/mySingleArray.length;
        return average;
    }
}
