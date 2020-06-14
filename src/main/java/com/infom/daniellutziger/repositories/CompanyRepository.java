package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query("SELECT c.name FROM Company c, Manufacturer m, Order o WHERE c.idCompany = m.idCompany AND m.idCompany = o.manufacturer AND o.orderDate = ?1")
    List<String> getOnlyCompanyNameByManufacturerIdAndOrderDate(Date date);

}
