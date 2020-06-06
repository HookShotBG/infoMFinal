package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    /*

    SELECT c.name
FROM company c, manufacturer m, ordertable o, ordertable_manufacturers om WHERE c.id_company = m.id_company
AND om.manufacturers_id_company = m.id_company
AND o.order_date > '2020-01-01'

     */
}
