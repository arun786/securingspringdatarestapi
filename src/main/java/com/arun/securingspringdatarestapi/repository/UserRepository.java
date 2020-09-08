package com.arun.securingspringdatarestapi.repository;

import com.arun.securingspringdatarestapi.domain.UserDomain;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author arun on 9/8/20
 */


public interface UserRepository extends PagingAndSortingRepository<UserDomain, UUID> {
}
