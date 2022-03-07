package com.example.BookingIndoorTurf.controller;

import com.example.BookingIndoorTurf.model.GroundModel;
import com.example.BookingIndoorTurf.model.UserModel;
import com.example.BookingIndoorTurf.service.GroundService;
import com.example.BookingIndoorTurf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    public UserService userService;

    @Autowired
    public GroundService groundserv;

    @GetMapping(value="/dashboard",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GroundModel>> getAllGrounds()
    {
        List<GroundModel> grounds =userService.getAllGrounds();
        return  new ResponseEntity<>(grounds, HttpStatus.OK);
    }

    @PostMapping(value="/addGround",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GroundModel> addGround(@RequestBody GroundModel ground){
        GroundModel newgm=groundserv.addGround(ground);
        return new ResponseEntity<>(newgm,HttpStatus.CREATED);
    }

    @PutMapping(value="/editGround/{groundid}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GroundModel> updateGround(@RequestBody GroundModel ground){
        GroundModel upgm=groundserv.updateGround(ground);
        return new ResponseEntity<>(upgm,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGround(@PathVariable("id") Long id){
        groundserv.deleteGround(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
