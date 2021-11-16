package edu.depaul.se452.group4.takeaseat.demo.spaces;



    import java.util.List;
    import java.util.UUID;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import edu.depaul.se452.group4.takeaseat.demo.amenities.Amenities;
import edu.depaul.se452.group4.takeaseat.demo.amenities.AmenitiesRepository;
import edu.depaul.se452.group4.takeaseat.demo.workspace.Workspace;
import edu.depaul.se452.group4.takeaseat.demo.workspace.WorkspaceRepository;
    
    @Service
    public class SpacesService {
    
        @Autowired
        private SpacesRepository spacesRepository;

        @Autowired
        private WorkspaceRepository workspaceRepository;

        @Autowired
        private AmenitiesRepository amenitiesRepository;

    
        public List<Spaces> findAll() {
            return spacesRepository.findAll();
        }
        
        public Workspace updateWorkspace(Workspace workspace) {
            workspaceRepository.save(workspace);
            return workspace;
        }
    
        public Workspace findWorkspaceById(String id) {
          return workspaceRepository.findById(Long.parseLong(id)).get();
        }

        public Amenities findAmenityById(String id) {
            return amenitiesRepository.findById(Long.parseLong(id)).get();
          }

        public void deleteWorkspaceById(String id) {
           
                workspaceRepository.deleteById(Long.parseLong(id));
            
            }

            public Amenities updateAmenity(Amenities amenity) {
                amenitiesRepository.save(amenity);
                return amenity;
            }
            
        public void deleteAmenityById(String id) {    
            
                amenitiesRepository.deleteById(Long.parseLong(id));   

        }



        }







