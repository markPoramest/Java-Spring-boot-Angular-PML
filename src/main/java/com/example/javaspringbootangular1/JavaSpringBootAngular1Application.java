package com.example.javaspringbootangular1;

import com.example.javaspringbootangular1.models.PremierLeagueModel;
import com.example.javaspringbootangular1.repositories.PremierLeagueRepository;
import com.example.javaspringbootangular1.services.PremierLeagueService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class JavaSpringBootAngular1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootAngular1Application.class, args);
	}
	

}
