package com.inn.iks.masterdata.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_EMPTY)
@Entity
@Table(name = "lov")
public class LovEntity extends BaseEntity{
	
	@Id
	@GeneratedValue
	@JsonProperty("id")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "type")
	@JsonProperty("type")
	private String type;
	
	@Column(name = "code")
	@JsonProperty("code")
	private String code;
	
	@Column(name = "value")
	@JsonProperty("value")
	private String value;
	
	@Column(name = "value_en")
	@JsonProperty("value_en")
	private String value_en;

	@Column(name = "parent")
	@JsonProperty("parent")
	private String parent;
	
	@Column(name = "status")
	@JsonProperty("status")
	private String status;
	
	@Column(name = "created_date")
	@JsonProperty("created_date")
	private Date createdDate;
	
	@Column(name = "created_by")
	@JsonProperty("created_by")
	private String createdBy;
	
	@Column(name = "modified_date")
	@JsonProperty("modified_date")
	private Date modifiedDate;
	
	@Column(name = "modified_by")
	@JsonProperty("modified_by")
	private String modifiedBy;

}
