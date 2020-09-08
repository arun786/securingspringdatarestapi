package com.arun.securingspringdatarestapi.repository;

import com.arun.securingspringdatarestapi.domain.ResolutionDomain;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author arun on 9/8/20
 */

public interface ResolutionRepository extends PagingAndSortingRepository<ResolutionDomain, Long> {

}
