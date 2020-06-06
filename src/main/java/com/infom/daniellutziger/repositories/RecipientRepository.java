package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {
}
