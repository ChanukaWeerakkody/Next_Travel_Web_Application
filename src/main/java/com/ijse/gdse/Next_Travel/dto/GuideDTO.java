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
@Data
@ToString
public class GuideDTO {
    private String fullName;
    private String address;
    private int age;
    private int contactNumber;
    private String gender;
    private String experience;

    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
}
