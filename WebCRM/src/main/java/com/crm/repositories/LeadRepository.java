package com.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.enities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
