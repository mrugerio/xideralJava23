package com.java.academy.finalproject.rest.repositories;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyFormDataRepository extends JpaRepository<AcademyFormData, Long> {}

