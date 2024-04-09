package com.nikben08.amadeusflightapi.repository;

import com.nikben08.amadeusflightapi.model.Airport;
import com.nikben08.amadeusflightapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource
public interface FlightRepository extends JpaRepository<Flight, Long> {
}