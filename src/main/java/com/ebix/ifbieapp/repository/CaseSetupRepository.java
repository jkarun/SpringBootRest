package com.ebix.ifbieapp.repository;

import java.util.List;

import com.ebix.ifbieapp.model.BaseProducts;


public interface CaseSetupRepository{
	List<BaseProducts> findOnePlanOfInsurance(String prodCode) throws Exception;
}
