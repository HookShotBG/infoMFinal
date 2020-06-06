package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

    //@Query(value="SELECT DISTINCT m from Manufacturer m join m.singleOrder odr where ")
    //public List<String> asf();

    @Query(value="SELECT DISTINCT c.name FROM Company c JOIN Man")
    public List<String> getCompanyNames();

}
