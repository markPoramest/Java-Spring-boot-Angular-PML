package com.example.javaspringbootangular1.services;

import com.example.javaspringbootangular1.models.PremierLeagueModel;
import com.example.javaspringbootangular1.repositories.PremierLeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremierLeagueService {
    @Autowired
    PremierLeagueRepository leagueRepository;

    public List<PremierLeagueModel> findAll(){
        return  leagueRepository.findAll();
    }

    public PremierLeagueModel findbyId(Long id){
        return leagueRepository.findById(id).isPresent()?leagueRepository.findById(id).get():null;
    }
    public void saveModel(PremierLeagueModel model){
        leagueRepository.save(model);
    }
}
