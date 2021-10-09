package edu.depaul.se452.group4.takeaseat.demo;



@Data
@Entity
public class Workspace {
    
@Id
@GeneratedValue
private long id;

    @Column(name = "workspacename")
    private String workspacename;

    @Column(name = "amenityID")
    private int amenityID;

    @Column(name = "maxSize")
    @NonNull
    private int maxSize;


}
/*CREATE TABLE workspace(
    workspaceID INT AUTO_INCREMENT PRIMARY KEY,
    workspacename VARCHAR(10),
    amenityID INT FOREIGN KEY(amenityID.amenities),
    maxSize INT NOT NULL,
    PRIMARY KEY (workspaceID)
);*/