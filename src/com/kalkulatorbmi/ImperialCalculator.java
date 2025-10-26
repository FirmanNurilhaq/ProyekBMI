package com.kalkulatorbmi;

/**
 * Implementasi BmiCalculator untuk satuan Imperial (pon dan inci).
 * Rumus: (berat * 703) / (tinggi * tinggi)
 *
 * @see BmiCalculator
 * @author Gemini (ganti dengan nama Anda)
 */
public class ImperialCalculator implements BmiCalculator {

    /**
     * Konstanta pengali untuk perhitungan BMI satuan Imperial.
     */
    private static final int IMPERIAL_MULTIPLIER = 703;

    /**
     * Menghitung nilai BMI menggunakan satuan Imperial.
     *
     * @param weight Berat badan dalam pon (lbs).
     * @param height Tinggi badan dalam inci (in).
     * @return Nilai BMI yang dihitung.
     * @throws IllegalArgumentException Jika berat atau tinggi <= 0.
     */
    @Override
    public double calculate(double weight, double height) throws IllegalArgumentException {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Berat dan tinggi harus lebih dari 0");
        }

        // Rumus BMI Imperial
        return (weight * IMPERIAL_MULTIPLIER) / (height * height);
    }
}