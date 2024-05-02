package AlatIoT;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<alatiot> components = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Tambah Komponen IoT (Sensor)");
            System.out.println("2. Tambah Komponen IoT (Actuator)");
            System.out.println("3. Tampilkan Semua Komponen IoT");
            System.out.println("4. Update Komponen IoT");
            System.out.println("5. Hapus Komponen IoT");
            System.out.println("6. Keluar");
            while (true) {

                try {
                    System.out.print("Pilih menu: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (choice) {
                        case 1:
                            tambahSensor();
                            break;
                        case 2:
                            tambahActuator();
                            break;
                        case 3:
                            tampilkanKomponen();
                            break;
                        case 4:
                            updateKomponen();
                            break;
                        case 5:
                            hapusKomponen();
                            break;
                        case 6:
                            System.out.println("Program selesai.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Menu tidak valid.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Harap Masukkan Angka!");
                    scanner.nextLine();
                }
            }
        }

    }

    private static void tambahSensor() {
        int kode;
        while (true) {
            try {
                System.out.print("Masukkan kode sensor: ");
                kode = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Harap Masukkan Angka!");
                scanner.nextLine();
            }
        }
        System.out.print("Masukkan nama sensor: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan tipe sensor: ");
        String type = scanner.nextLine();
        System.out.print("Masukkan format data: ");
        String dataFormat = scanner.nextLine();

        sensor sensor = new sensor(kode, name, type, dataFormat);
        components.add(sensor);
        System.out.println("Sensor berhasil ditambahkan.");
    }

    private static void tambahActuator() {
        int kode;
        while (true) {
            try {
                System.out.print("Masukkan kode aktuator: ");
                kode = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Harap Masukkan Angka!");
                scanner.nextLine();
            }
        }
        System.out.print("Masukkan nama aktuator: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan tipe aktuator: ");
        String type = scanner.nextLine();
        System.out.print("Masukkan aksi: ");
        String action = scanner.nextLine();

        aktuator actuator = new aktuator(kode, name, type, action);
        components.add(actuator);
        System.out.println("Aktuator berhasil ditambahkan.");
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
            int index;
            while (true) {
                try {
                    System.out.print("Masukkan indeks komponen yang ingin diupdate: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Harap Masukkan Angka!");
                    scanner.nextLine();
                }
            }
            if (index >= 0 && index < components.size()) {
                System.out.print("Masukkan nama baru: ");
                String newName = scanner.nextLine();
                System.out.print("Masukkan tipe baru: ");
                String newType = scanner.nextLine();
                components.get(index).setNama(newName);
                components.get(index).setTipe(newType);
                if (components.get(index) instanceof sensor) {
                    System.out.print("Masukkan format data baru: ");
                    String newDataFormat = scanner.nextLine();
                    ((sensor) components.get(index)).setDataFormat(newDataFormat);
                } else if (components.get(index) instanceof aktuator) {
                    System.out.print("Masukkan aksi baru: ");
                    String newAction = scanner.nextLine();
                    ((aktuator) components.get(index)).setAction(newAction);
                }
                System.out.println("Komponen berhasil diupdate.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }

    private static void hapusKomponen() {
        tampilkanKomponen();
        if (!components.isEmpty()) {
            int index;
            while (true) {
                try {
                    System.out.print("Masukkan indeks komponen yang ingin dihapus: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Harap Masukkan Angka!");
                    scanner.nextLine();
                }
            }
            if (index >= 0 && index < components.size()) {
                components.remove(index);
                System.out.println("Komponen berhasil dihapus.");
            } else {
                System.out.println("Indeks tidak valid.");
            }
        }
    }
}
