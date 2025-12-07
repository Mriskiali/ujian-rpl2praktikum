/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_watchlistfilm_4ia16.repository;

import com.mycompany.ujian_watchlistfilm_4ia16.model.Media;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author muafa
 */
public interface MediaRepository extends JpaRepository<Media, Long> {
    List<Media> findByJudulContainingIgnoreCase(String judul);
    List<Media> findByStatusTontonan(String status);
}
