package edu.depaul.se452.group4.takeaseat.demo.spaces;



    import java.util.List;
    import java.util.UUID;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import edu.depaul.se452.group4.takeaseat.demo.amenities.AmenitiesRepository;
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
        
        public Spaces update(Spaces space) {
            spacesRepository.save(space);
            return space;
        }
    
        public Spaces findById(String id) {
          return spacesRepository.findById(Long.parseLong(id)).get();
        }

        public void deleteWorkspaceById(String id) {
           
                workspaceRepository.deleteById(Long.parseLong(id));
            
            }
            
        public void deleteAmenityById(String id) {    
            
                amenitiesRepository.deleteById(Long.parseLong(id));   

        }



        }







