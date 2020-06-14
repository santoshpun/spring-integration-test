package com.santosh.integrationtest.repository;

import com.santosh.integrationtest.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {

    @Query("select t from ApplicationUser t where t.username = :username")
    Optional<ApplicationUser> findByUsername(@Param("username") String username);
}
