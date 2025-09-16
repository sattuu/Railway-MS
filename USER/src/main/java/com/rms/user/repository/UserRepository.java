package com.rms.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rms.user.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {

}
