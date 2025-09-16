package com.rms.admin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AdminEntityMW {
	
	@Id
	private String adminID;

	public AdminEntityMW(String name) {
		this.adminID = name;
	}

}
