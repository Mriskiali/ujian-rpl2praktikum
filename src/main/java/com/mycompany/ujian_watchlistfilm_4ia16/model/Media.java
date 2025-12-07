/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_watchlistfilm_4ia16.model;

import jakarta.persistence.*;

/**
 *
 * @author muafa
 */
@Entity
@Table(name = "media_tontonan")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String judul;

    @Column(nullable = false)
    private String jenis;

    @Column(name = "tahun_rilis")
    private Integer tahunRilis;

    private String genre;

    @Column(nullable = false)
    private String statusTontonan;

    private Float ratingPribadi;

    @Column(columnDefinition = "TEXT")
    private String sinopsis;

    public Media() {}

    public Media(String judul, String jenis, Integer tahunRilis, String genre, String sinopsis) {
        this.judul = judul;
        this.jenis = jenis;
        this.tahunRilis = tahunRilis;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.statusTontonan = "Watchlist";
        this.ratingPribadi = 0.0f;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(Integer tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatusTontonan() {
        return statusTontonan;
    }

    public void setStatusTontonan(String statusTontonan) {
        this.statusTontonan = statusTontonan;
    }

    public Float getRatingPribadi() {
        return ratingPribadi;
    }

    public void setRatingPribadi(Float ratingPribadi) {
        this.ratingPribadi = ratingPribadi;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}