package com.example.empleados;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
    @Test
    void testLomhok() {
        var empleado = new Empleado();
        empleado.setNombre("Jordan");
        empleado.setApellido("Salazar");
        empleado.setPuesto("CEO, CTO, CPO");
        
        // Verificaciones con assertEquals
        assertEquals("Jordan", empleado.getNombre());

    }

    @Test 
    void testConstructor() {
        var empleado = new Empleado("Aranza", "Dimter", "CTO");
        assertEquals("Aranza", empleado.getNombre());
        assertEquals("Dimter", empleado.getApellido());
        assertEquals("CTO", empleado.getPuesto());
    }
}
