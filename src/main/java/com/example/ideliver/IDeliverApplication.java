package com.example.ideliver;

import com.example.ideliver.entities.UserProfile;
import com.example.ideliver.enums.RoleEnum;
import com.example.ideliver.enums.TypeEnum;
import com.example.ideliver.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IDeliverApplication implements CommandLineRunner {
    @Autowired
    public UserProfileRepository userProfileRepository;

    public static void main(String[] args) {
        SpringApplication.run(IDeliverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserProfile profile = userProfileRepository.save(new UserProfile(null,"wiss","lass","null","null", RoleEnum.ADMIN, TypeEnum.DRIVER,null,null,null));

        System.out.println("profile done "+profile);

    }
}
