package com.ebix.ifbieapp.service;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.ifbieapp.form.CaseSetupForm;
import com.ebix.ifbieapp.model.AppCase;
import com.ebix.ifbieapp.model.BaseProducts;
import com.ebix.ifbieapp.repository.CaseSetupRepository;

@Service
public class CaseSetupServiceImpl implements CaseSetupService {

	@Autowired
	CaseSetupRepository caseSetupRepository;

	@Override
	public List<BaseProducts> findOnePlanOfInsurance(String prodCode) throws Exception{
		return caseSetupRepository.findOnePlanOfInsurance(prodCode);
	}

	@Override
	public String saveCaseSetup(CaseSetupForm form) {
		AppCase appcase = new AppCase();
		this.copyProperties(form, appcase, new ArrayList<String>());
//		caseSetupRepository.save(appcase);
		
		BeanUtils.copyProperties(form, appcase);
		return null;
	}
	
	
	public static void copyProperties(Object src, Object trg, Iterable<String> props) {
	    BeanWrapper srcWrap = PropertyAccessorFactory.forBeanPropertyAccess(src);
	    BeanWrapper trgWrap = PropertyAccessorFactory.forBeanPropertyAccess(trg);
	    props.forEach(p -> trgWrap.setPropertyValue(p, srcWrap.getPropertyValue(p)));
	}
	public static String[] getNullPropertyNames(Object source) {
	    final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
	    return Stream.of(wrappedSource.getPropertyDescriptors())
	            .map(FeatureDescriptor::getName)
	            .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
	            .toArray(String[]::new);
	}
}
