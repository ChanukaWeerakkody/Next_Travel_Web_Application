package com.ijse.gdse.Next_Travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class UserDTO {
    private Long userId;
    private String username;
    private String password;
    private String nicNumber;
    private int age;
    private String gender;
    private String email;
    private String address;
    private int phoneNumber;

    private String image1;
    private String image2;
}
