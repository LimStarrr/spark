package com.juns.world.spark.repository;

import com.juns.world.spark.domain.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
public interface UserRepository extends PagingAndSortingRepository<Users, Long> {
    List<Users> findByEmail(@Param("email") String email);
}
