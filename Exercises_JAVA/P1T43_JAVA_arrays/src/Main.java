import java.util.Scanner;

public class Main {
    // Author: Juan Camilo Villamil Gonzalez
    // Date: 2021-April-16
    // Description: This software is for a homework

    public static void main(String[] args) {

        int counter=0;
        int v_total=0;
        double v_average=0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the quantity of the cuts");
        int v_cut= keyboard.nextInt();
        float [] p_array= new float[v_cut];

        for (counter=0; counter<p_array.length; counter++){
            System.out.println("Type the qualification of cut "+(counter+1));
            p_array[counter]= keyboard.nextFloat();
            v_average=v_average+p_array[counter];
        }

        for (counter=0; counter<p_array.length; counter++){
            System.out.println("Your qualification of cut "+(counter+1)+" is: "+p_array[counter]);
            v_total= (int) (v_total+p_array[counter]);
        }

        for (counter=0; counter<p_array.length; counter++){
            if (counter==0){
                System.out.println("The value percent of note "+(counter+1)+" is: "+(p_array[counter]*0.1));
            }
            if (counter==1){
                System.out.println("The value percent of note "+(counter+1)+" is: "+(p_array[counter]*0.3));
            }
            if (counter>=2){
                System.out.println("The value percent of note "+(counter+1)+" is: "+(p_array[counter]*0.6/(p_array.length-2)));
            }
        }

        System.out.println("Your average notes is: "+p_average(v_average, v_cut));
    }
    public static double p_average(double v_average, int v_cut){
        v_average = v_average / v_cut;
        return v_average;
    }

    public static void p_show_info_program() {
        System.out.println("╔════════════════════════════════════════════════╗-");
        System.out.println("║      Author: Juan Camilo Villamil Gonzalez     ║ ");
        System.out.println("║   Description: This software is for do arrays  ║ ");
        System.out.println("╚════════════════════════════════════════════════╝");
    }
}

