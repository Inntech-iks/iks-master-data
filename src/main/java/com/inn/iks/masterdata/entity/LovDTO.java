package com.inn.iks.masterdata.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LovDTO {

	private String type;
	private String code;
	private String value;
	private String value_en;
	private String parent;
}
