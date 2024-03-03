package com.example.lapangan.service;

import com.example.lapangan.entity.Lapangan;
import com.example.lapangan.repository.LapanganRepository;

import java.util.List;

public class LapanganServiceImpl implements LapanganService {

    private LapanganRepository lapanganRepository;

    @Override
    public List<Lapangan> semuaLapangan() {
        return lapanganRepository.findAll();
    }

    @Override
    public Lapangan simpanLapangan(Lapangan lapangan) {
        return lapanganRepository.save(lapangan);
    }
}
