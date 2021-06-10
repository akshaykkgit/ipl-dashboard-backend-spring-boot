package com.akshay.ipldashboard.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Match {
	@Id
	private Long id                           ;
	private String Season                     ;
	private String city                       ;
	private LocalDate date                    ;
	private String team1                      ;
	private String team2                      ;
	private String toss_winner                ;
	private String toss_decision              ;
	private String result                     ;
	private String winner                     ;
	private String winByRuns                  ;
	private String winByWickets               ;
	private String playerOfTheMatch           ;
	private String venue                      ;
	private String umpire1                    ;
	private String umpire2                    ;
	private String umpire3                    ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSeason() {
		return Season;
	}
	public void setSeason(String season) {
		Season = season;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getToss_winner() {
		return toss_winner;
	}
	public void setToss_winner(String toss_winner) {
		this.toss_winner = toss_winner;
	}
	public String getToss_decision() {
		return toss_decision;
	}
	public void setToss_decision(String toss_decision) {
		this.toss_decision = toss_decision;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getWinByRuns() {
		return winByRuns;
	}
	public void setWinByRuns(String winByRuns) {
		this.winByRuns = winByRuns;
	}
	public String getWinByWickets() {
		return winByWickets;
	}
	public void setWinByWickets(String winByWickets) {
		this.winByWickets = winByWickets;
	}
	public String getPlayerOfTheMatch() {
		return playerOfTheMatch;
	}
	public void setPlayerOfTheMatch(String playerOfTheMatch) {
		this.playerOfTheMatch = playerOfTheMatch;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getUmpire1() {
		return umpire1;
	}
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	public String getUmpire2() {
		return umpire2;
	}
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}
	public String getUmpire3() {
		return umpire3;
	}
	public void setUmpire3(String umpire3) {
		this.umpire3 = umpire3;
	}
	
	public Match() {
		
	}
	
	

}



              

