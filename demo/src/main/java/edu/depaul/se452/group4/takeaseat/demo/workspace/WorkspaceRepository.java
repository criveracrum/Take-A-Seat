package edu.depaul.se452.group4.takeaseat.demo.workspace;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    
    @Query("Select s FROM Workspace s WHERE s.workspacename LIKE %?1%")
    List<Workspace> findAll(String keyword);
}
// +  "OR s.workspaceType LIKE %?1%"
   // +  "OR s.maxSize LIKE %?1%")