package com.spring.user.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.IncomeDetails;

public interface IncomeRepository extends JpaRepository<IncomeDetails, Serializable> {

}
