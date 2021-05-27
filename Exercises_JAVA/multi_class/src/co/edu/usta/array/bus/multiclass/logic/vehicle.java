package co.edu.usta.array.bus.multiclass.logic;

public class vehicle {
    private String services_type;
    private String color;
    private String brand;
    private float width;
    private float height;
    private int doorNumber;
    private int wheelsNumber;
    private String plates;
    private char[][] places;

    public void setServices_type(String services_type_value) {
        services_type = services_type_value;
    }

    public String getServices_type() {
        return services_type;
    }

    public void setColor(String color_value) {
        color = color_value;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand_value) {
        brand = brand_value;
    }

    public String getBrand() {
        return brand;
    }

    public void setWidth(float width_value) {
        width = width_value;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height_value) {
        height = height_value;
    }

    public float getHeight() {
        return height;
    }

    public void setDoorNumber(int doorNumber_value) {
        doorNumber = doorNumber_value;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setWheelsNumber(int wheelsNumber_value) {
        wheelsNumber = wheelsNumber_value;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setPlates(String plates_value) {
        plates = plates_value;
    }

    public String getPlates() {
        return plates;
    }


    public void create_places_array(String rows) {
        int rowsInt = Integer.parseInt(rows);
        places = new char[rowsInt][4];
    }

    public void init_places_array() {
        boolean letters = true;

        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                if (letters == true) {
                    places[i][j] = 'D';
                } else {
                    places[i][j] = 'X';
                }
            }
            if (letters == true) {
                letters = false;
            } else {
                letters = true;
            }
        }
    }

    public String array_show() {
        String return_string = "";

        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                return_string = return_string + places[i][j] + " ";
            }
            return_string = return_string + "\n";
        }
        return return_string;
    }

    public String fill_places(String row, String column) {
        int rowInt = Integer.parseInt(row);
        int columnInt = Integer.parseInt(column);

        if (places[rowInt][columnInt] == 'X' || places[rowInt][columnInt] == 'O') {
            return "The place is unavailable";
        } else {
            places[rowInt][columnInt]='O';
                return "The place is available";
            }
        }

        public String status_OF_places() {
        int filled_places=0, empty_places=0;
            for (int i = 0; i < places.length; i++) {
                for (int j = 0; j < places[0].length ; j++) {
                    if (places[i][j]=='O') {
                        filled_places++;
                    }
                    if (places[i][j]=='D') {
                        empty_places++;
                    }
                }
            }
        return "The amount of filled places is: "+filled_places+", the amount of empty places is: "+empty_places;
        }
    }