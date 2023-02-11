package edu.pro.projectbasic.service;
/*
  @author   george
  @project   project-basic
  @class  PatientService
  @version  1.0.0 
  @since 11.02.23 - 20.04
*/

import edu.pro.projectbasic.model.Patient;
import edu.pro.projectbasic.repository.PatientRepositoryAsList;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PatientService {
//    private List<Patient> patients = List.of(new Patient("1", "John", "123 ", LocalDateTime.now()),
//            new Patient("2", "Paul", "456 ", LocalDateTime.now()),
//            new Patient("3", "Paul", "456 ", LocalDateTime.now()),
//            new Patient("4", "George", "000", LocalDateTime.now()));

    @Autowired
    PatientRepositoryAsList repository;

    public List<Patient> getAll(){
        return repository.findAll();
    }

}
