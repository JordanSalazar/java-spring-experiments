package com.example.empleados;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmpleadoDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String employerName;
    private String employerSurname;
    private String employerField;

}
 