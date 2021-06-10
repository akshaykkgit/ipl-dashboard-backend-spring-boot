package com.akshay.ipldashboard.data;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.akshay.ipldashboard.model.Match;


public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {
	
	
	
	  private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

	  @Override
	  public Match process(final MatchInput matchInput) throws Exception {
	   
		  
		  
		  Match match=new Match();
		  match.setId(Long.parseLong(matchInput.getId()));
		  match.setCity(matchInput.getCity());
		  match.setDate(LocalDate.parse(matchInput.getDate()));
		  match.setTeam1(matchInput.getTeam1());
		  match.setTeam2(matchInput.getTeam2());
		 
		  
		  match.setToss_winner(matchInput.getToss_winner());
		  match.setToss_decision(matchInput.getToss_decision());
		  match.setResult(matchInput.getResult());
		  match.setWinner(matchInput.getWinner());
		  match.setWinByRuns(matchInput.getWin_by_runs());
		  match.setWinByWickets(matchInput.getWin_by_wickets());
		  match.setPlayerOfTheMatch(matchInput.getPlayer_of_match());
		  match.setVenue(matchInput.getPlayer_of_match());
		  match.setUmpire1(matchInput.getUmpire1());
		  match.setUmpire2(matchInput.getUmpire2());
		  match.setUmpire3(matchInput.getUmpire3());
		   

	      log.info(match.toString());

	      return match;
	  }

	
	}


