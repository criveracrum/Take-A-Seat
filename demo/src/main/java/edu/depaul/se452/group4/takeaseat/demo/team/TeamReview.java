package edu.depaul.se452.group4.takeaseat.demo.team;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Allows Employees to submit end-of-project Reviews of their Team

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class TeamReview {
  @Id
  private String team;
  private String review;
  private String reviewer;
}