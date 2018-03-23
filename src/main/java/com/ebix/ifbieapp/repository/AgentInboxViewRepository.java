package com.ebix.ifbieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebix.ifbieapp.model.AgentInboxView;

@Repository
public interface AgentInboxViewRepository extends JpaRepository<AgentInboxView, Long> {

}
