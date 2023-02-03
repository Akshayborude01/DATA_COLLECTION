package com.spring.user.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user.entities.KidsDetails;

public interface KidsRepository extends JpaRepository<KidsDetails, Serializable> {

}
