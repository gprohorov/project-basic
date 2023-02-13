package edu.pro.projectbasic.controller;
/*
  @author   george
  @project   project-basic
  @class  PatientController
  @version  1.0.0 
  @since 11.02.23 - 20.12
*/

import edu.pro.projectbasic.model.Patient;
import edu.pro.projectbasic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService service;
//    private List<Patient> patients = List.of(new Patient("1", "John", "123 ", LocalDateTime.now()),
//            new Patient("2", "Paul", "456 ", LocalDateTime.now()),
//            new Patient("3", "George", "789 ", LocalDateTime.now()));

    @Autowired
    public PatientController(PatientService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public List<Patient> getPatients(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    public Patient getPatient(@PathVariable("id") String id) throws ChangeSetPersister.NotFoundException {
        return service.get(id);
    }


}
