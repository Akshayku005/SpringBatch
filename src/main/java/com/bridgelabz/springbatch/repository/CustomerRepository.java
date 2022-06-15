package com.bridgelabz.springbatch.repository;

import com.bridgelabz.springbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<User,Integer> {
}
