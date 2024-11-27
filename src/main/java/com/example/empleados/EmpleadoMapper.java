package com.example.empleados;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "String")
public interface EmpleadoMapper {

    EmpleadoMapper INSTANCE = Mappers.getMapper(EmpleadoMapper.class);

    @Mapping(target = "nombre", source = "source.employerName")
    @Mapping(target = "apellido", source = "source.employerSurname")
    @Mapping(target = "puesto", source = "source.employerField")
    @Mapping(target = "identifier", source = "source.id")
    Empleado sourceToDestination(EmpleadoDao source);

    @Mapping(target = "employerName", source = "destination.nombre")
    @Mapping(target = "employerSurname", source = "destination.apellido")
    @Mapping(target = "employerField", source = "destination.puesto")
    @Mapping(target = "id", source = "destination.identifier")
    EmpleadoDao destinationToSource(Empleado destination);

}
