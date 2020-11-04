package com.example.javaspringbootangular1.models;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PremierLeague")
public class PremierLeagueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PMLid")
    private Long id;
    @NonNull
    private String ClubName;
    @NonNull
    private Integer rankTable;
    @NonNull
    private String coachName;
    @NonNull
    private String fieldName;

    PremierLeagueModel(){

    }

}

