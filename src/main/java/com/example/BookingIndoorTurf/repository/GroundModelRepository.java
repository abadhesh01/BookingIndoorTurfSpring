package com.example.BookingIndoorTurf.repository;

import com.example.BookingIndoorTurf.model.GroundModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroundModelRepository extends JpaRepository<GroundModel ,String> {


 

    void deleteGroundById(Long id);


    GroundModel findGroundByGroundId(Long id);
}
