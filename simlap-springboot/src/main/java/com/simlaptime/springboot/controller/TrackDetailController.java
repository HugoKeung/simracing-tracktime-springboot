package com.simlaptime.springboot.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.simlaptime.springboot.model.TrackDetail;
import com.simlaptime.springboot.repository.TrackDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TrackDetailController {
    @Autowired
    TrackDetailRepository trackDetailRepository;

    @GetMapping("/tracks")
    public ResponseEntity<List<TrackDetail>> getAllTracks(){

        List<TrackDetail> tracks = new ArrayList<TrackDetail>();

        
        trackDetailRepository.findAll().forEach(tracks::add);
        return new ResponseEntity<List<TrackDetail>>(tracks, HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){

 
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

}
