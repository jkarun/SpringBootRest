package com.ebix.ifbieapp.service;

import java.util.List;

import com.ebix.ifbieapp.form.CaseSetupForm;
import com.ebix.ifbieapp.model.BaseProducts;

public interface CaseSetupService {
	List<BaseProducts> findOnePlanOfInsurance(String prodCode) throws Exception;
	String saveCaseSetup(CaseSetupForm form);
}
