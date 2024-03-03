package com.example.lapangan.repository;

import com.example.lapangan.entity.Lapangan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lapangan.repository.LapanganRepository;


@Repository
public interface LapanganRepository extends JpaRepository<Lapangan, Long> {
    void setLapanganRepository(LapanganRepository lapanganRepository);
}
