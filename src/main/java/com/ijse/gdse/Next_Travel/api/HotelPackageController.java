package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.HotelPackageDTO;
import com.ijse.gdse.Next_Travel.service.HotelPackageService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/package")
@CrossOrigin
public class HotelPackageController {
    @Autowired
    HotelPackageService hotelPackageService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil savePackage(@RequestBody HotelPackageDTO packageDTO){
        System.out.println(packageDTO.toString());
        hotelPackageService.savePackage(packageDTO);
        return new ResponseUtil(200,"Success",packageDTO);
    }
}
