package com.microservice.demo.controller;

import com.microservice.demo.model.School;
import com.microservice.demo.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/school")
@CrossOrigin("*")
public class SchoolController {
  @Autowired
  private SchoolService schoolService;

  @PostMapping
  public School addSchool(@RequestBody School school){
    return schoolService.saveSchool(school);
  }

  @GetMapping
  public List<School> getAllSchool(){
    return  schoolService.getAllSchool();
  }

  @GetMapping("/{id}")
  public School fetchSchoolById(@PathVariable int id){
    return schoolService.getSchoolById(id);
  }
}