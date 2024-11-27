package com.example.empleados;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Empleado {
    private long identifier;
    private String nombre;
    private String apellido;
    private String puesto;

    // Constructor personalizado
    public Empleado(String nombre, String apellido, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
}
}



