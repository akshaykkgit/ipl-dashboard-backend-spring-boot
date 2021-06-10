package com.akshay.ipldashboard.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.akshay.ipldashboard.model.Match;
import java.time.LocalDate;

public interface MatchRepository extends CrudRepository<Match, Long> {
	
	List<Match> getByTeam1OrTeam2OrderByDateDesc(String team1,String team2,Pageable pageable);
	@Query("from Match m where (m.team1=:teamName or m.team2=:teamName ) and m.date between :startDate and :endDate order by date desc")
	List<Match> getMAtchByTeamBetweenDates(@Param("teamName") String teamName,@Param("startDate")LocalDate startDate,@Param("endDate")LocalDate endDate);
	//Below is the another way of building same Query as above
	//List<Match> getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc(String team1,LocalDate date1,LocalDate date2,String team2,LocalDate date3,LocalDate date4);
	default List<Match> findLatestMatchesByName(String teamName,int count){
		return getByTeam1OrTeam2OrderByDateDesc(teamName, teamName, PageRequest.of(0, 4));
	}

}
