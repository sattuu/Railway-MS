package com.rms.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rms.admin.entity.AdminEntityMW;

@Repository
public interface AdminRepositoty extends MongoRepository<AdminEntityMW, String>{

}
