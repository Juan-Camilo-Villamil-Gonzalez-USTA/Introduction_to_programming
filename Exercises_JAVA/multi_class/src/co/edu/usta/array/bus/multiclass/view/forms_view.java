package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.vehicle;

import javax.swing.*;

public class forms_view {
    private static vehicle myVehicle;

    public static void main(String[] params) {
      myVehicle = new vehicle();
        String value, show_info, row, column;
        int value_confirm_dialog;


        value = JOptionPane.showInputDialog("Type the kind of service of your vehicle");
        myVehicle.setServices_type(value);
        show_info = myVehicle.getServices_type();
        JOptionPane.showMessageDialog(null, "Your kind of service for this vehicle is: " + show_info);


        value = JOptionPane.showInputDialog("Type the kind of color of your vehicle");
        myVehicle.setColor(value);
        show_info = myVehicle.getColor();
        JOptionPane.showMessageDialog(null, "Your color for this vehicle is: " + show_info);


        value = JOptionPane.showInputDialog("Type the kind of brand of your vehicle");
        myVehicle.setBrand(value);
        show_info = myVehicle.getBrand();
        JOptionPane.showMessageDialog(null, "Your brand for this vehicle is: " + show_info);


        float value_float = 0;
        value_float = Float.parseFloat(JOptionPane.showInputDialog("Type the width of your vehicle"));
        myVehicle.setWidth(value_float);
        show_info = String.valueOf(myVehicle.getWidth());
        JOptionPane.showMessageDialog(null, "Your width for this vehicle is: " + show_info);


        value_float = Float.parseFloat(JOptionPane.showInputDialog("Type the height of your vehicle"));
        myVehicle.setHeight(value_float);
        show_info = String.valueOf(myVehicle.getHeight());
        JOptionPane.showMessageDialog(null, "Your height for this vehicle is: " + show_info);

        int value_int = 0;
        value_int = Integer.parseInt(JOptionPane.showInputDialog("Type the doors number of your vehicle"));
        myVehicle.setDoorNumber(value_int);
        show_info = String.valueOf(myVehicle.getDoorNumber());
        JOptionPane.showMessageDialog(null, "Your doors number for this vehicle is: " + show_info);


        value_int = Integer.parseInt(JOptionPane.showInputDialog("Type the wheels number of your vehicle"));
        myVehicle.setWheelsNumber(value_int);
        show_info = String.valueOf(myVehicle.getWheelsNumber());
        JOptionPane.showMessageDialog(null, "Your wheels number for this vehicle is: " + show_info);


        value = JOptionPane.showInputDialog("Type the plates of your vehicle");
        myVehicle.setPlates(value);
        show_info = myVehicle.getPlates();
        JOptionPane.showMessageDialog(null, "Your plates for this vehicle is: " + show_info);


        value = JOptionPane.showInputDialog("Type the number of rows in your vehicle");
        myVehicle.create_places_array(value);
        myVehicle.init_places_array();

        do {
            show_info = myVehicle.array_show();
            JOptionPane.showMessageDialog(null, show_info);
            row = JOptionPane.showInputDialog("Type the row to fill for your place in the bus");
            column = JOptionPane.showInputDialog("Type the column to fill for your place in the bus");
            show_info = myVehicle.fill_places(row, column);
            JOptionPane.showMessageDialog(null, show_info);
            value_confirm_dialog = JOptionPane.showConfirmDialog(null, "Are you want include another passenger (YES)?, \n" +
                    " or leave away the bus (NO)");

        }
        while (value_confirm_dialog == JOptionPane.YES_OPTION);
        show_info= myVehicle.status_OF_places();
        JOptionPane.showMessageDialog(null, show_info);
    }
}