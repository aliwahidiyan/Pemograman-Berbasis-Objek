package AlatIoT;

// File: Actuator.java
public class aktuator extends alatiot {
    private String action;

    // Constructor
    public aktuator(int kode, String nama, String tipe, String action) {
        super(kode, nama, tipe);
        this.action = action;
    }

    // Getter untuk action
    public final String getAction() {
        return action;
    }

    // Setter untuk action
    public void setAction(String action) {
        this.action = action;
    }

    // Override toString() untuk representasi string dari objek Actuator
    public String toString() {
        return "Nama Komponen: " + nama + ", Tipe: " + tipe + ", Action: " + action;
    }
}
