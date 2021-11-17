package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

  @Autowired
  private TeamRepository repository;

  public List<Team> findAll() {
    return repository.findAll();
  }

  public Team update(Team team) {
    repository.save(team);
    return team;
  }

  public Team findById(String id) {
    return repository.findById(Long.parseLong(id)).get();
  }

  public void deleteById(String id) {
    repository.deleteById(Long.parseLong(id));
  }
}
