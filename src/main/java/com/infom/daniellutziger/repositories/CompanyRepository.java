package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Company;
import com.infom.daniellutziger.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    /*

    SELECT c.name
FROM company c, manufacturer m, ordertable o, ordertable_manufacturers om WHERE c.id_company = m.id_company
AND om.manufacturers_id_company = m.id_company
AND o.order_date > '2020-01-01'

     */

    //@Query(value="SELECT DISTINCT c.name FROM Company c JOIN ")
    //public List<String> getCompanyNames();

    /*
    @Query("SELECT c.name FROM Company c, Manufacturer m, Order o WHERE c.idCompany = m.idCompany AND m.idCompany = o.manufacturers AND o.date = ?1")
    List<String> getCompanyNameByManufacturerByOrderByOrderDate(Date date);*/

}
