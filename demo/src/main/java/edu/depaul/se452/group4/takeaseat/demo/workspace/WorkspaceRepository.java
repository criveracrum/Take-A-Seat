package edu.depaul.se452.group4.takeaseat.demo.workspace;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    @Override
    List<Workspace> findAll();
}
