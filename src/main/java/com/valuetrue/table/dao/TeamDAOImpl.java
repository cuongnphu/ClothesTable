package com.valuetrue.table.dao;

import com.valuetrue.table.model.Team;
import com.valuetrue.table.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;



@Repository
public class TeamDAOImpl implements TeamDAO {

    private TeamRepository teamRepository;

    // SPRING will instance and inject it when declare class
    @Autowired
    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // SAVE a Team
    @Override
    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

    // UPDATE a Team
    @Override
    public void updateTeam(Team team) {
        Team temp = teamRepository.getOne(team.getId());
        temp.setName(team.getName());
        temp.setTeamId(team.getTeamId());
        temp.setTotal(team.getTotal());
        temp.setEnable(team.isEnable());
        teamRepository.save(temp);
    }

    // DELETE a Team by Id
    @Override
    public void deleteTeam(int id) {
        teamRepository.deleteById(id);
    }

    // GET a Team by Id
    @Override
    public Team getTeamById(int id) {
        return teamRepository.findById(id);
    }

    // GET all Teams
    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // GET all Teams by params
    @Override
    public List<Team> getAllTeamsOrderByParams(ArrayList<String> listParams, String option) {
        return teamRepository.findAll(new Sort(Sort.Direction.ASC,listParams.get(0).toString()));
    }

    // GET all Teams by TeamId
    @Override
    public List<Team> getAllTeamsByTeamId(int team_id) {
        return teamRepository.findByTeamId(team_id);
    }

    // GET all Teams by Acitve
    @Override
    public List<Team> getAllTeamsByActive() {
        return teamRepository.findByEnable(true);
    }
}
