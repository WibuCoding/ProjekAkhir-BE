package com.example.lapangan.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
public class Lapangan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String pemesan;
    private String dipesan;
    private Date tanggalpesan;

    // Getter dan Setter
}
