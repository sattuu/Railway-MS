package com.rms.user.enums;

public enum GenderEnum {

	Male("male"),

	Femal("female"),

	Other("other");

	private String code;

	GenderEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

}
