


DROP TABLE IF EXISTS  Amenities;
DROP TABLE IF EXISTS  Workspace;




CREATE TABLE Amenities(
    amenityID serial  PRIMARY KEY,
    amenityName VARCHAR(10)
    
);


CREATE TABLE workspace(
    
    workspaceID serial  PRIMARY KEY,
    workspacename VARCHAR(10),
    amenityID  INT,
    maxSize INT NOT NULL
    
    
    
);



