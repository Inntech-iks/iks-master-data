package com.inn.iks.masterdata.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.iks.masterdata.entity.LovEntity;


@Repository
public interface LovRepo extends JpaRepository<LovEntity, Long> {
	LovEntity findByCode (String code);
	List<LovEntity> findByType(String type);
	List<LovEntity> findByTypeAndCode (String type, String code);
	
}
