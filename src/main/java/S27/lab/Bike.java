package S27.lab;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "bike_id")
public class Bike extends Vehicle {
    private String model;
    private String type;

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}