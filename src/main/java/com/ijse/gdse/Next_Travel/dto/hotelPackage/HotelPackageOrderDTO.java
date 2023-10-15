package com.ijse.gdse.Next_Travel.dto.hotelPackage;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.guide.GuideOrderDetailsDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class HotelPackageOrderDTO {
    private Long oid;
    private String date;
    private UserDTO user;
    private List<HotelPackageOrderDetailsDTO> ordersDetails;
}
