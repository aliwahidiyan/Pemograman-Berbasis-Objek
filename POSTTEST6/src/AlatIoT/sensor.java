package AlatIoT;

// File: Sensor.java
public final class sensor extends alatiot {
    private String dataFormat;

    // Constructor
    public sensor(int kode, String nama, String tipe, String dataFormat) {
        super(kode, nama, tipe);
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
    public String toString() {
        return "Nama Komponen: " + nama + ", Tipe: " + tipe + ", Data Format: " + dataFormat;
    }
}
