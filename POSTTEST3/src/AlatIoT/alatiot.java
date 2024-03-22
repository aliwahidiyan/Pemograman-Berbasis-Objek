package AlatIoT;

public class alatiot {
    private String nama; // Atribut nama dideklarasikan sebagai private, sehingga hanya dapat diakses oleh kelas alatiot itu sendiri.
    protected String tipe; // Atribut tipe dideklarasikan sebagai protected, sehingga dapat diakses oleh kelas dalam package yang sama atau sub classnya.

    // Constructor
    public alatiot(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk tipe
    protected String getTipe() {
        return tipe;
    }

    // Setter untuk tipe
    protected void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Override toString() untuk representasi string dari objek alaiot
    @Override
    public String toString() {
        return "Nama Komponen: " + nama + ", Tipe: " + tipe;
    }
}

