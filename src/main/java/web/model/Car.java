package web.model;


public class Car {
    private String color;
    private String model;
    private int id;


    public Car(String color, String model, int id) {
        this.color = color;
        this.model = model;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
