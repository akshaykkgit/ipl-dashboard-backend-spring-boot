package com.akshay.ipldashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.akshay.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
	Team findByTeamName(String teamName);

}
