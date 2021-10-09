package edu.depaul.se452.group4.takeaseat.demo.price;

import java.io.Serializable;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "price")
public class PriceNoSQL implements Serializable{
    
    private Integer id;
    private Integer price;

}