package com.example.lapangan.service;

import com.example.lapangan.entity.Lapangan;

import java.util.List;

public interface LapanganService {

    // Setter untuk LapanganRepository

    // Metode untuk mendapatkan semua lapangan
    List<Lapangan> semuaLapangan();

    // Metode untuk menyimpan lapangan baru
    Lapangan simpanLapangan(Lapangan lapangan);
}
