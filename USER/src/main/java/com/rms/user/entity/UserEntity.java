package com.rms.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.rms.user.enums.GenderEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	@Id
	private String userName;

	private String userPassword;

	private int userAge;

	private GenderEnum userGender;

}
