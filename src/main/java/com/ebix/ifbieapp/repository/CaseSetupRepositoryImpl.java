package com.ebix.ifbieapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ebix.ifbieapp.model.BaseProducts;

@Repository
public class CaseSetupRepositoryImpl implements CaseSetupRepository {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<BaseProducts> findOnePlanOfInsurance(String prodCode) throws Exception{
		Query query = entityManager.createQuery("select t from BaseProducts t where t.prodCd=:prodCd");
		query.setParameter("prodCd", prodCode);
		List<BaseProducts> list = query.getResultList();
		return (list != null) ? list : null;
	}

}
