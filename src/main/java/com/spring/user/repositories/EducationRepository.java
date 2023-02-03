package com.spring.user.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.EducationDetails;

public interface EducationRepository extends JpaRepository<EducationDetails, Serializable> {

}
