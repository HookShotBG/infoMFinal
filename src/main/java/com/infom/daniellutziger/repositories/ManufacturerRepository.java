package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

        /*

    SELECT c.name
FROM company c, manufacturer m, ordertable o, ordertable_manufacturers om WHERE c.id_company = m.id_company
AND om.manufacturers_id_company = m.id_company
AND o.order_date > '2020-01-01'

     */

        /*
    @Query(value="SELECT DISTINCT m.name from Manufacturer m join m.singleOrder odr where odr.idOrder = m.idCompany and odr.orderDate > '2020-01-01'")
    public List<String> getCompanyName();

*/
}
