package edu.escuelaing.ieti.h2project.service;

import edu.escuelaing.ieti.h2project.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Country save(Country country);

    Optional<Country> findById(Long id);

    List<Country> all();

    void deleteById(Long id);

    Country update(Country country, Long countryId);
}
