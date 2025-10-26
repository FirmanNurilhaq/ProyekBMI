package com.kalkulatorbmi;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kelas utama (Main) untuk menjalankan aplikasi Kalkulator BMI.
 * Kelas ini menangani input pengguna dan mengarahkan logika
 * ke kalkulator yang sesuai.
 */
public class Main {

    /**
     * Metode main sebagai titik masuk (entry point) aplikasi.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiCalculator calculator = null; // Variabel untuk menyimpan kalkulator

        try {
            System.out.println("--- Kalkulator BMI ---");
            System.out.println("Pilih satuan Anda:");
            System.out.println("1. Metrik (kg, meter)");
            System.out.println("2. Imperial (pon, inci)");
            System.out.print("Pilihan (1 atau 2): ");

            int choice = scanner.nextInt();

            double weight, height;

            if (choice == 1) {
                // Gunakan kalkulator Metrik
                calculator = new MetricCalculator();
                System.out.print("Masukkan berat badan (kg): ");
                weight = scanner.nextDouble();
                System.out.print("Masukkan tinggi badan (meter, misal: 1.75): ");
                height = scanner.nextDouble();

            } else if (choice == 2) {
                // Gunakan kalkulator Imperial
                calculator = new ImperialCalculator();
                System.out.print("Masukkan berat badan (pon): ");
                weight = scanner.nextDouble();
                System.out.print("Masukkan tinggi badan (inci): ");
                height = scanner.nextDouble();

            } else {
                System.out.println("Pilihan tidak valid.");
                return; // Keluar dari program
            }

            // Hitung dan tampilkan hasil
            double bmi = calculator.calculate(weight, height);
            String category = calculator.getCategory(bmi);

            System.out.println("\n--- HASIL ---");
            System.out.printf("Nilai BMI Anda: %.2f\n", bmi);
            System.out.println("Kategori Anda: " + category);

        } catch (InputMismatchException e) {
            System.err.println("Error: Input harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Terjadi error: " + e.getMessage());
        } finally {
            scanner.close(); // Selalu tutup scanner
        }
    }
}