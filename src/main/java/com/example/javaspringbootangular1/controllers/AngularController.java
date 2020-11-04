package com.example.javaspringbootangular1.controllers;

import com.example.javaspringbootangular1.models.PremierLeagueModel;
import com.example.javaspringbootangular1.services.PremierLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/pml")
@RestController
public class AngularController {

    @Autowired
    PremierLeagueService premierLeagueService;

    @GetMapping("/findAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<PremierLeagueModel> findAll(){
        return premierLeagueService.findAll();
    }
}
