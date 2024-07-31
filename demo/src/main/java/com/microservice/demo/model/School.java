package com.microservice.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "school")
public class School {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String schoolName;
  private String location;
  private String principalName;
}