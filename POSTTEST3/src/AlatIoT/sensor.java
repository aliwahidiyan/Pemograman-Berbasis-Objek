package AlatIoT;

// File: Sensor.java
public class sensor extends alatiot {
    private String dataFormat;

    // Constructor
    public sensor(String nama, String tipe, String dataFormat) {
        super(nama, tipe);
        this.dataFormat = dataFormat;
    }

    // Getter untuk dataFormat
    public String getDataFormat() {
        return dataFormat;
    }

    // Setter untuk dataFormat
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    // Override toString() untuk representasi string dari objek Sensor
    @Override
    public String toString() {
        return super.toString() + ", Data Format: " + dataFormat;
    }
}
