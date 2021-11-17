package edu.depaul.se452.group4.takeaseat.demo.team;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
  @Override
  public List<Team> findAll();
}
