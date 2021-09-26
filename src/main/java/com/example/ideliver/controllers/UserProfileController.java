package com.example.ideliver.controllers;

import com.example.ideliver.entities.UserProfile;
import com.example.ideliver.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")

public class UserProfileController {
    @Autowired
    private UserProfileRepository userProfileRepository;

    @GetMapping("/")
    List<UserProfile> getAll(){
        return  userProfileRepository.findAll();
    }
    @GetMapping("/{id}")
    UserProfile getUserProfile(@PathVariable String id){
        return  userProfileRepository.findById(id).orElse(null);
    }
    @PostMapping("/")
    UserProfile postUserProfile(@RequestBody UserProfile userProfile){
        return  userProfileRepository.save(userProfile);
    }
    @PutMapping("/{id}")
    UserProfile updateUserProfile(@PathVariable String id,@RequestBody UserProfile userProfile){
        UserProfile oldProfile = userProfileRepository.findById(id).orElse(null);
        oldProfile.setFirstName((userProfile.getFirstName()));
        oldProfile.setLastName(userProfile.getLastName());
        oldProfile.setBio(userProfile.getBio());
        return  userProfileRepository.save(oldProfile);
    }
    @DeleteMapping("/{id}")
    String deleteUserProfile(@PathVariable String id){
        userProfileRepository.deleteById(id);
        return  id;
    }

}
