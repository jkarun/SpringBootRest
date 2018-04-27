package com.ebix.ifbieapp.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebix.ifbieapp.model.PicfUser;

@Repository
public interface PicfUserRepository extends JpaRepository<PicfUser, BigDecimal>   {

}
