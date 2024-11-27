package com.example.empleados;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "empleados", path = "empleados")
public interface EmpleadoRepository extends PagingAndSortingRepository<EmpleadoDao, Long> {

    Iterable<EmpleadoDao> findAll();

    void save(EmpleadoDao dao);


}


