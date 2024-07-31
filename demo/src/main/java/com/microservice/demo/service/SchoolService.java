package com.microservice.demo.service;

import com.microservice.demo.model.School;
import com.microservice.demo.repository.SchoolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
  @Autowired
  private SchoolRepository schoolRepository;

  public School saveSchool(School school) {
    return schoolRepository.save(school);
  }

  public List<School> getAllSchool(){
    return schoolRepository.findAll();
  }
  public School getSchoolById(int id){
    return schoolRepository.findById(id).orElse(null);
  }
}
