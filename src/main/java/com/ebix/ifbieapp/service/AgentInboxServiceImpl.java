package com.ebix.ifbieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.ifbieapp.model.AgentInboxView;
import com.ebix.ifbieapp.repository.AgentInboxViewRepository;
import com.ebix.ifbieapp.util.JsonObjectConverter;

@Service
public class AgentInboxServiceImpl implements AgentInboxService {

	@Autowired
	AgentInboxViewRepository agentInboxViewRepository;

	@Override
	public String getAgentInboxView(String agentCode) throws Exception {
		List<Object> list = agentInboxViewRepository.findByIdLstUpdtUserId(agentCode);

		String[] columnNames = { "caseid", "caseId", "insuredName", "insuredContact", "planCode", "planName",
				"prouctCode", "productName", "faceAmount", "amountCollected", "casetypecd", "signedDae",
				"daysLeftToSubmit", "applncasetypecd", "companyid", "companyCode", "companyName", "lstUpdtUserId",
				"caseStatus", };
		
		String json = JsonObjectConverter.generateJSONFromObjectArray(list, columnNames, "AGENT_INBOX");
		return json;
	}

}
