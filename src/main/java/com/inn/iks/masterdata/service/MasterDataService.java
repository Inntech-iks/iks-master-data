package com.inn.iks.masterdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.iks.masterdata.entity.LovEntity;
import com.inn.iks.masterdata.repo.LovRepo;


@Service
public class MasterDataService {
	@Autowired
	LovRepo lovRepo;
	
	public List<LovEntity> getLovByType (String type) {
		return lovRepo.findByType(type) ;
	}
	public List<LovEntity> getLovByTypeAndCode (String type, String code) {
		return lovRepo.findByTypeAndCode(type, code) ;
	}
}
