package edu.pro.projectbasic.repository;
/*
  @author   george
  @project   project-basic
  @class  PatientRepositoryMongo
  @version  1.0.0 
  @since 11.02.23 - 21.21
*/

import edu.pro.projectbasic.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepositoryMongo extends MongoRepository<Patient, String> {
}
