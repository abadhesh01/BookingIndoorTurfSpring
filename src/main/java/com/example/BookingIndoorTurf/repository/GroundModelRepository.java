package com.example.BookingIndoorTurf.repository;

import com.example.BookingIndoorTurf.model.GroundModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroundModelRepository extends JpaRepository<GroundModel ,Long> {


 

    // void deleteGroundById(Long id); --> Incorrect Declaration. Not required. So commenting.


    // GroundModel findGroundByGroundId(Long id); -->Incorrect Declaration. Not required. So commenting.
}
