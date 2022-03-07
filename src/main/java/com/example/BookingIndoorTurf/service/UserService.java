package com.example.BookingIndoorTurf.service;

import com.example.BookingIndoorTurf.exception.GroundNotFoundException;
import com.example.BookingIndoorTurf.model.GroundModel;
import com.example.BookingIndoorTurf.model.UserModel;
import com.example.BookingIndoorTurf.repository.GroundModelRepository;
import com.example.BookingIndoorTurf.repository.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserModelRepository userrepo;

    @Autowired
    public GroundModelRepository groundrepo;

    public UserService(UserModelRepository repo){
        this.userrepo=repo;
    }

    public void saveUser(UserModel um){
        userrepo.save(um);
    }

    public List<GroundModel> getAllGrounds(){
        List<GroundModel> all = groundrepo.findAll();
        return all;
    }
    public GroundModel getGroundByGroundId(Long id) {
  return (GroundModel) groundrepo.findGroundByGroundId(id);
    }
}
