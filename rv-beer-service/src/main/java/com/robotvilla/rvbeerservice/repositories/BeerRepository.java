package com.robotvilla.rvbeerservice.repositories;

import com.robotvilla.rvbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

// Don't need to annotate with @Repository
// already a bean through extended interfaces?
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
