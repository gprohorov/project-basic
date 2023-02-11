package edu.pro.projectbasic.model;
/*
  @author   george
  @project   project-basic
  @class  Patient
  @version  1.0.0 
  @since 11.02.23 - 19.59
*/

import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {
    private String id;
    private String name;
    private String phoneNumber;
    private LocalDateTime createAt;

    public Patient(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getId().equals(patient.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
