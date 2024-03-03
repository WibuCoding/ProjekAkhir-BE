package com.example.lapangan.controller;

import com.example.lapangan.entity.Lapangan;
import com.example.lapangan.service.LapanganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lapangan")

public class LapanganController {
    @Autowired
    private LapanganService lapanganService;

    // Endpoint untuk mendapatkan semua lapangan
    @GetMapping("/semua")
    public List<Lapangan> semuaLapangan() {
        return lapanganService.semuaLapangan();
    }

    // Endpoint untuk menyimpan lapangan baru
    @PostMapping("/simpan")
    public Lapangan simpanLapangan(@RequestBody Lapangan lapangan) {
        return lapanganService.simpanLapangan(lapangan);
    }
}
