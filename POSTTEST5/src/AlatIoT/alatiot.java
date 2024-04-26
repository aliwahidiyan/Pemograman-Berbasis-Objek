package AlatIoT;

public abstract class alatiot {
    private final int kode;
    protected String nama; // Atribut nama dideklarasikan sebagai private, sehingga hanya dapat diakses
                           // oleh kelas alatiot itu sendiri.
    protected String tipe; // Atribut tipe dideklarasikan sebagai protected, sehingga dapat diakses oleh
                           // kelas dalam package yang sama atau sub classnya.

    // Constructor
    public alatiot(int kode, String nama, String tipe) {
        this.kode = kode;
        this.nama = nama;
        this.tipe = tipe;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk kode
    public int getKode() {
        return kode;
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

    public abstract String toString();
}
