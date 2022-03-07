package com.example.BookingIndoorTurf.service;

import com.example.BookingIndoorTurf.exception.GroundNotFoundException;
import com.example.BookingIndoorTurf.model.GroundModel;
import com.example.BookingIndoorTurf.repository.GroundModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroundService {

    @Autowired
    public GroundModelRepository groundrepo;

    public GroundService() {
    }

    public GroundModel addGround(GroundModel gm) {
        return groundrepo.save(gm);
    }

    public List<GroundModel> findAllGrounds() {
        return groundrepo.findAll();
    }

    public GroundModel updateGround(GroundModel gm) {
        return groundrepo.save(gm);
    }

    public GroundModel findGroundByGroundId(Long id) {
        return groundrepo.findGroundByGroundId(id);

    }

    public void deleteGround(Long id) {
        groundrepo.deleteGroundById(id);
    }
}


