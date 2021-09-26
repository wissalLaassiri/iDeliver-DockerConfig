package com.example.ideliver.entities;

import com.example.ideliver.enums.RoleEnum;
import com.example.ideliver.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String bio;
    private String avatarUrl;
//    @Enumerated(EnumType.STRING)
    private RoleEnum role;
//    @Enumerated(EnumType.STRING)
    private TypeEnum type;
    private String phoneNumber;
    private String gender;
    private Date dateBirth;


}
