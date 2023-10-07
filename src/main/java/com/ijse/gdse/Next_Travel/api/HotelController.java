package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.HotelDTO;
import com.ijse.gdse.Next_Travel.service.HotelService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/hotel")
@CrossOrigin
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute HotelDTO hotelDTO){
        hotelService.saveHotel(hotelDTO);
        return new ResponseUtil(200,"Success",hotelDTO);
    }
}
