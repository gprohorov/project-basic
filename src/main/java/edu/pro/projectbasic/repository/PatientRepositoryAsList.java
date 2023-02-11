package edu.pro.projectbasic.repository;

import edu.pro.projectbasic.model.Patient;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/*
  @author   george
  @project   project-basic
  @class  PatientRepository
  @version  1.0.0 
  @since 11.02.23 - 20.52
*/

@Repository
public class PatientRepositoryAsList {
    private List<Patient> patients = List.of(new Patient("1", "John", "123 ", LocalDateTime.now()),
            new Patient("2", "Paul", "456 ", LocalDateTime.now()),
            new Patient("3", "George", "789 ", LocalDateTime.now()),
            new Patient("4", "Ringo", "987", LocalDateTime.now()),
            new Patient("5", "Freddie", "654", LocalDateTime.now()));

    public List<Patient> findAll() {
        return patients;
    }

}
