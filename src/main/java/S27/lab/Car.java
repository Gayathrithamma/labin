package S27.lab;


import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "car_id")
public class Car extends Vehicle {
    private String model;
    private boolean automatic;

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
}
