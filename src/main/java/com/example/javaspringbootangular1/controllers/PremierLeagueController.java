package com.example.javaspringbootangular1.controllers;

import com.example.javaspringbootangular1.models.PremierLeagueModel;
import com.example.javaspringbootangular1.services.PremierLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PremierLeagueController {
    @Autowired
    PremierLeagueService leagueService;

    @GetMapping("/findAll")
    public List<PremierLeagueModel> findAll(){
        return leagueService.findAll();
    }

    @PostMapping("/insert")
    public  void insert(@RequestBody PremierLeagueModel premierLeagueModel){
        leagueService.saveModel(premierLeagueModel);
    }
}
