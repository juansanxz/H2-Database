package edu.escuelaing.ieti.h2project.service;

import edu.escuelaing.ieti.h2project.model.Country;
import edu.escuelaing.ieti.h2project.repository.CountryRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public List<Country> all() {
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        countryRepository.deleteById(id);

    }

    @Override
    public Country update(Country country, Long countryId) {
        return null;
    }
}
