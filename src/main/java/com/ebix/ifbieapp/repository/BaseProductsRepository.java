package com.ebix.ifbieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebix.ifbieapp.model.BaseProducts;

@Repository
public interface BaseProductsRepository extends JpaRepository<BaseProducts, Integer>{

}
