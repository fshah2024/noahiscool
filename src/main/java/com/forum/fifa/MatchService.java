package com.forum.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatchService {
    @Autowired
    private MatchRepo mrepo;
    private List<Team> teams;

    public List<Matches> getAllM(){
        return mrepo.findAll();
    }
    public List<Team> getGroupWinners(String group){
     return null;
    }
    public String getOverallWinner(){
        return null;
    }
    public List<Team> getAllTeams(){
        return teams;
    }
    private Team findOrAddTeam(String teamName){
        return null;
    }
    private void playMatch(Team home, Team other, int goals, int oGoals){
        if(goals>oGoals){
            home.setWins(home.getWins()+1);
            other.setLosses(other.getLosses()+1);
        }
        else if(goals<oGoals){
            other.setWins(other.getWins()+1);
            home.setLosses(home.getLosses()+1);
        }
        else{
            other.setTies(other.getTies()+1);
            home.setTies(home.getTies()+1);
        }

    }
}
