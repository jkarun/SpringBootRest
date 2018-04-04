package com.ebix.ifbieapp.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebix.ifbieapp.form.CaseSetupForm;
import com.ebix.ifbieapp.model.AgentInboxView;
import com.ebix.ifbieapp.model.BaseProducts;
import com.ebix.ifbieapp.repository.AgentInboxViewRepository;
import com.ebix.ifbieapp.service.CaseSetupService;
import com.ebix.ifbieapp.util.JsonObjectConverter;

@CrossOrigin()
@RequestMapping(value = "/cs")
@ResponseBody
@RestController
public class CaseSetupController {

	@Autowired
	AgentInboxViewRepository agentInboxViewRepository;

	@Autowired
	CaseSetupService caseSetupService;
	
	@GetMapping()
	public  List<AgentInboxView> getAgentInboxList() throws IOException {
//		AgentInboxView inboxList = agentInboxViewRepository.findByIdCaseid("E10046");
		
		//test code to test spring data
		
		List<CaseSetupForm> csList = new ArrayList<>();
		CaseSetupForm frm1 = new CaseSetupForm("INDIANA","USA","1980-05-05",33,'N', "WLIFE","Whole Life",'N','N',"CHW","CHW",'N',"",new BigDecimal(50000));
		csList.add(frm1);
		
		String jsonObj = JsonObjectConverter.converObjectToJson(csList); 
		System.out.println(jsonObj);
		
		List<AgentInboxView> inboxList =null;
//		List<AgentInboxView> inboxList = agentInboxViewRepository.findByIdLstUpdtUserId("de01");
		/*try {
			return JsonObjectConverter.converObjectToJson(inboxList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";*/
		return inboxList;
	}

	@GetMapping("/planOfInsurance")
	public List<BaseProducts> getPlanOfInsurance(@RequestParam String prodCd) {
		try {
			List<BaseProducts> list = caseSetupService.findOnePlanOfInsurance(prodCd);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResourceNotFoundException();
		}

	}
	
	@PostMapping
	public String saveCaseSetup(@RequestBody CaseSetupForm form) {
		
		
		return null;
	}

}
