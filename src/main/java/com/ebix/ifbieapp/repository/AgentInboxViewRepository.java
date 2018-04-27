package com.ebix.ifbieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ebix.ifbieapp.model.AgentInboxView;
import com.ebix.ifbieapp.model.AgentInboxViewId;

@RepositoryRestResource
public interface AgentInboxViewRepository extends PagingAndSortingRepository<AgentInboxView, AgentInboxViewId> {
	AgentInboxView findByIdCaseid(String caseid);

	@Query(nativeQuery = true, name="AgentInboxViewNativeQuery")
	List<Object> findByIdLstUpdtUserId(@Param("lstUpdtUserId") String lstUpdtUserId);
}
