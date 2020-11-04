package com.example.javaspringbootangular1.repositories;

import com.example.javaspringbootangular1.models.PremierLeagueModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PremierLeagueRepository extends JpaRepository<PremierLeagueModel,Long> {

}
