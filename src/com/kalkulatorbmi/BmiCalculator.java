package com.kalkulatorbmi;

/**
 * Interface BmiCalculator mendefinisikan kontrak untuk semua jenis
 * kalkulator BMI.
 * * Setiap kelas implementasi harus menyediakan metode untuk menghitung BMI
 * dan mendapatkan kategori BMI.
 *
 * @author FIRMAN NURILHAQ
 * @version 1.0
 */
public interface BmiCalculator {

    /**
     * Menghitung nilai BMI berdasarkan berat dan tinggi.
     *
     * @param weight Berat badan (dalam kg atau pon, tergantung implementasi).
     * @param height Tinggi badan (dalam meter atau inci, tergantung implementasi).
     * @return Nilai BMI yang dihitung sebagai double.
     * @throws IllegalArgumentException Jika berat atau tinggi bernilai 0 atau
     *                                  negatif.
     */
    double calculate(double weight, double height) throws IllegalArgumentException;

    /**
     * Memberikan kategori BMI (misal: "Normal", "Overweight")
     * berdasarkan nilai BMI yang telah dihitung.
     * * Ini adalah metode default dan tidak perlu di-override.
     *
     * @param bmi Nilai BMI yang sudah dihitung.
     * @return Sebuah String yang berisi kategori hasil BMI.
     */
    default String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Thinness (Kurus)";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal (Normal)";
        } else if (bmi > 24.9 && bmi <= 29.9) {
            return "Overweight (Kelebihan Berat Badan)";
        } else {
            return "Obese (Obesitas)";
        }
    }
}