package AlatIoT;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<alatiot> komponen = new ArrayList<>();
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
        System.out.print("Masukkan jenis komponen (Sensor/Actuator): ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan nama komponen: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan tipe komponen: ");
        String tipe = scanner.nextLine();

        if (jenis.equalsIgnoreCase("Sensor")) {
            System.out.print("Masukkan format data: ");
            String dataFormat = scanner.nextLine();
            sensor sensor = new sensor(nama, tipe, dataFormat);
            komponen.add(sensor);
            System.out.println("Sensor berhasil ditambahkan.");
        } else if (jenis.equalsIgnoreCase("Actuator")) {
            System.out.print("Masukkan aksi: ");
            String action = scanner.nextLine();
            aktuator actuator = new aktuator(nama, tipe, action);
            komponen.add(actuator);
            System.out.println("Actuator berhasil ditambahkan.");
        } else {
            System.out.println("Jenis komponen tidak valid.");
        }
    }

    private static void tampilkanKomponen() {
        if (komponen.isEmpty()) {
            System.out.println("Belum ada komponen yang didata.");
        } else {
            System.out.println("Daftar Komponen IoT:");
            for (alatiot component : komponen) {
                System.out.println(component);
            }
        }
    }

    private static void updateKomponen() {
        tampilkanKomponen();
        if (!komponen.isEmpty()) {
            System.out.print("Masukkan indeks komponen yang ingin diupdate: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // consume newline
            if (index >= 0 && index < komponen.size()) {
                System.out.print("Masukkan nama baru: ");
                String newName = scanner.nextLine();
                System.out.print("Masukkan tipe baru: ");
                String newType = scanner.nextLine();
                komponen.get(index).setNama(newName);
                komponen.get(index).setTipe(newType);
                if (komponen.get(index) instanceof sensor) {
                    System.out.print("Masukkan format data baru: ");
                    String newDataFormat = scanner.nextLine();
                    ((sensor) komponen.get(index)).setDataFormat(newDataFormat);
                } else if (komponen.get(index) instanceof aktuator) {
                    System.out.print("Masukkan aksi baru: ");
                    String newAction = scanner.nextLine();
                    ((aktuator) komponen.get(index)).setAction(newAction);
                }
                System.out.println("Komponen berhasil diupdate.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }

    private static void hapusKomponen() {
        tampilkanKomponen();
        if (!komponen.isEmpty()) {
            System.out.print("Masukkan indeks komponen yang ingin dihapus: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // consume newline
            if (index >= 0 && index < komponen.size()) {
                komponen.remove(index);
                System.out.println("Komponen berhasil dihapus.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }
}
