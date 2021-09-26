package com.example.ideliver.repositories;

import com.example.ideliver.entities.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile,String> {

}
