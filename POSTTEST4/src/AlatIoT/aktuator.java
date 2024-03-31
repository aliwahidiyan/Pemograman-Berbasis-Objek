package AlatIoT;

// File: Actuator.java
public class aktuator extends alatiot {
    private String action;

    // Constructor
    public aktuator(String nama, String tipe, String action) {
        super(nama, tipe);
        this.action = action;
    }

    // Getter untuk action
    public String getAction() {
        return action;
    }

    // Setter untuk action
    public void setAction(String action) {
        this.action = action;
    }

    // Override toString() untuk representasi string dari objek Actuator
    @Override
    public String toString() {
        return super.toString() + ", Action: " + action;
    }
}
