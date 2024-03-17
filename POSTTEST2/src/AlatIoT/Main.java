package AlatIoT;
import java.util.ArrayList;
import java.util.Scanner;

class alatiot {
    private String nama;
    private String tipe;

    public alatiot(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
    }

    public String getName() {
        return nama;
    }

    public String getType() {
        return tipe;
    }

    @Override
    public String toString() {
        return "Nama Komponen: " + nama + ", Tipe: " + tipe;
    }
}

public class Main {
    private static ArrayList<alatiot> components = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Komponen IoT");
            System.out.println("2. Tampilkan Semua Komponen IoT");
            System.out.println("3. Update Komponen IoT");
            System.out.println("4. Hapus Komponen IoT");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    tambahKomponen();
                    break;
                case 2:
                    tampilkanKomponen();
                    break;
                case 3:
                    updateKomponen();
                    break;
                case 4:
                    hapusKomponen();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }

    private static void tambahKomponen() {
        System.out.print("Masukkan nama komponen: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan jenis komponen: ");
        String type = scanner.nextLine();
        alatiot component = new alatiot(name, type);
        components.add(component);
        System.out.println("Komponen berhasil ditambahkan.");
    }

    private static void tampilkanKomponen() {
        if (components.isEmpty()) {
            System.out.println("Belum ada komponen yang didata.");
        } else {
            System.out.println("Daftar Komponen IoT:");
            for (alatiot component : components) {
                System.out.println(component);
            }
        }
    }

    private static void updateKomponen() {
        tampilkanKomponen();
        if (!components.isEmpty()) {
            System.out.print("Masukkan indeks komponen yang ingin diupdate: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // consume newline
            if (index >= 0 && index < components.size()) {
                System.out.print("Masukkan nama baru: ");
                String newName = scanner.nextLine();
                System.out.print("Masukkan jenis baru: ");
                String newType = scanner.nextLine();
                alatiot updatedComponent = new alatiot(newName, newType);
                components.set(index, updatedComponent);
                System.out.println("Komponen berhasil diupdate.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }

    private static void hapusKomponen() {
        tampilkanKomponen();
        if (!components.isEmpty()) {
            System.out.print("Masukkan indeks komponen yang ingin dihapus: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // consume newline
            if (index >= 0 && index < components.size()) {
                components.remove(index);
                System.out.println("Komponen berhasil dihapus.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }
}
