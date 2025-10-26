package com.kalkulatorbmi;

/**
 * Implementasi BmiCalculator untuk satuan Metrik (kilogram dan meter).
 * Rumus: berat / (tinggi * tinggi)
 *
 * @see BmiCalculator
 * @author Gemini (ganti dengan nama Anda)
 */
public class MetricCalculator implements BmiCalculator {

    /**
     * Menghitung nilai BMI menggunakan satuan Metrik.
     *
     * @param weight Berat badan dalam kilogram (kg).
     * @param height Tinggi badan dalam meter (m).
     * @return Nilai BMI yang dihitung.
     * @throws IllegalArgumentException Jika berat atau tinggi <= 0.
     */
    @Override
    public double calculate(double weight, double height) throws IllegalArgumentException {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Berat dan tinggi harus lebih dari 0");
        }

        // Rumus BMI Metrik
        return weight / (height * height);
    }

    // Kita tidak perlu implementasi getCategory(double bmi)
    // karena kita menggunakan implementasi 'default' dari interface.
}