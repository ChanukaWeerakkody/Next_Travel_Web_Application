package com.ijse.gdse.Next_Travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleOrdersDTO {
    private Long oid;
    private String date;
    private UserDTO user;
    private List<VehicleOrderDetailsDTO> ordersDetails;
}
