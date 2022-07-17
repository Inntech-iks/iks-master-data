package com.inn.iks.masterdata.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inn.iks.masterdata.entity.LovDTO;
import com.inn.iks.masterdata.service.MasterDataService;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller
 * 
 * @author HienNT
 */

@Slf4j
@RestController
@RequestMapping(value = "/masterdata")
public class MasterDataController {

	@Autowired
	private MasterDataService masterDataService ;
	@Autowired
	private ModelMapper modelMapper;	
	
//	@ApiOperation(value = "get all partner", notes = "get all partner.")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = Constant.SUCCESS_MESSAGE, response = String.class),
//			@ApiResponse(code = 400, message = Constant.BADREQUEST_MESSAGE, response = ErrorResponse.class),
//			@ApiResponse(code = 500, message = Constant.INTERNALERROR_MESSAGE, response = ErrorResponse.class) })
//	@PreAuthorize("@authenticationRequestInfo.printLog('get_all_partner') AND #oauth2.hasScope('get_all_partner')")
	@RequestMapping(value = "/v1/lov/type={type}", method = RequestMethod.GET)
	public ResponseEntity<List<LovDTO>> getLovByType(@PathVariable(name = "type") String type) throws Exception { 
		log.info("Validate request get LOV type {}", type);
		List<LovDTO> lovDTO = 
				masterDataService.getLovByType(type).stream().map(lovEntity -> modelMapper.map(lovEntity, LovDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok(lovDTO);
	}

	@RequestMapping(value = "/v1/lov", method = RequestMethod.GET)
	public ResponseEntity<List<LovDTO>> getLovByTypeAndCode(@RequestParam(value= "type", required = true) String type, @RequestParam(value = "code", required = true) String code) throws Exception { 
		log.info("Validate request get LOV type {}", type);
		List<LovDTO> lovDTO = 
				masterDataService.getLovByTypeAndCode(type,code).stream().map(lovEntity -> modelMapper.map(lovEntity, LovDTO.class)).collect(Collectors.toList());
		return ResponseEntity.ok(lovDTO);
	}

}
