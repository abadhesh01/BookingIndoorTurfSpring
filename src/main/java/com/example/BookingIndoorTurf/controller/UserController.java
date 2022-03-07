package com.example.BookingIndoorTurf.controller;


import com.example.BookingIndoorTurf.exception.GroundNotFoundException;
import com.example.BookingIndoorTurf.model.GroundModel;
import com.example.BookingIndoorTurf.model.UserModel;
import com.example.BookingIndoorTurf.repository.UserModelRepository;
import com.example.BookingIndoorTurf.service.GroundService;
import com.example.BookingIndoorTurf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserModelRepository userModelRepository;

    @Autowired
    public UserService userservice;

    @Autowired
    public GroundService groundserv;

    public UserController(UserService userservice){
        this.userservice=userservice;
    }




    @PostMapping("/register")
    public String saveUser(@RequestBody UserModel user){
        userservice.saveUser(user);
        return "Registration Successful";
    }

    @GetMapping("/dashboard")
    public ResponseEntity<List<GroundModel>>  getAllGrounds()
    {
        List<GroundModel> grounds =userservice.getAllGrounds();
        return  new ResponseEntity<>(grounds, HttpStatus.OK);

    }

    @GetMapping(value="/ground/{id}")
    public ResponseEntity<GroundModel> findGroundByGroundId(@PathVariable(value="id") Long id) throws GroundNotFoundException {
     GroundModel ground=  groundserv.findGroundByGroundId(id);

return new ResponseEntity<>(ground,HttpStatus.OK);
    }

}
