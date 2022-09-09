package com.example.demo.repository;

import com.example.demo.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
}
