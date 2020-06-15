package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

}
