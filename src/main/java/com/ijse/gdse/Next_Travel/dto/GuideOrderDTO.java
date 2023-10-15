package com.ijse.gdse.Next_Travel.dto;

import com.ijse.gdse.Next_Travel.entity.GuideOrderDetails;
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
public class GuideOrderDTO {
    private Long oid;
    private String date;
    private UserDTO user;
    private List<GuideOrderDetailsDTO> ordersDetails;
}
