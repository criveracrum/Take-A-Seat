







CREATE TABLE Amenities(
    amenityID  INT AUTO_INCREMENT PRIMARY KEY,
    amenityName VARCHAR(10),
    PRIMARY KEY (amenityID)
);


CREATE TABLE workspace(
    workspaceID INT AUTO_INCREMENT PRIMARY KEY,
    workspacename VARCHAR(10),
    amenityID INT FOREIGN KEY(amenityID.amenities),
    maxSize INT NOT NULL,
    PRIMARY KEY (workspaceID)
);



