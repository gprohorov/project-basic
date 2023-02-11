package edu.pro.projectbasic.service;
/*
  @author   george
  @project   project-basic
  @class  PatientService
  @version  1.0.0 
  @since 11.02.23 - 20.04
*/

import edu.pro.projectbasic.model.Patient;
import edu.pro.projectbasic.repository.PatientRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    private List<Patient> patients = List.of(
            new Patient("1", "John", "123 ", LocalDateTime.now()),
            new Patient("2", "Paul", "456 ", LocalDateTime.now()),
            new Patient("3", "Ringo", "789 ", LocalDateTime.now()),
            new Patient("4", "George", "000", LocalDateTime.now()));

    @Autowired
    PatientRepositoryMongo repository;

    // @PostConstruct
    void init(){
        repository.saveAll(patients);
    }

    public List<Patient> getAll(){
        return repository.findAll();
    }
    public Optional<Patient> getById(String id){
        return repository.findById(id);
    }
    public Patient create(Patient patient){
        return repository.save(patient);
    }
    public Patient update(Patient patient){
        return repository.save(patient);
    }

    public Patient delete(String id){
        Patient patient = this.getById(id).get();
        repository.deleteById(id);
        return patient;
    }


}
