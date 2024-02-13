package edu.escuelaing.ieti.h2project.repository;

import edu.escuelaing.ieti.h2project.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}