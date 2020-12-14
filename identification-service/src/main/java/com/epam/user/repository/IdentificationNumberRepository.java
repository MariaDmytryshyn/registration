package com.epam.user.repository;

import com.epam.user.model.IdentificationNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationNumberRepository extends JpaRepository<IdentificationNumber, Long> {
}
