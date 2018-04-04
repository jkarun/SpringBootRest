package com.ebix.ifbieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebix.ifbieapp.model.AgentInboxView;
import com.ebix.ifbieapp.service.AgentInboxService;

@CrossOrigin()
@RestController
@RequestMapping("/agent")
@ResponseBody
public class AgentInboxController {

	@Autowired
	AgentInboxService agentInboxService;

	@GetMapping
	public String getAgentInbox(@RequestParam String agentId) {

		try {
			String inboxList = agentInboxService.getAgentInboxView(agentId);
			return inboxList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
