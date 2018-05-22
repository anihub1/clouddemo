package com.nisum.demo.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")

public interface UserDataRestRepository  extends PagingAndSortingRepository<User, Long>{

	
	
}
