package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine, Long> {
}
