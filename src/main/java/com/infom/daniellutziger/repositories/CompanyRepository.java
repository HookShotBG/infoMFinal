package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
