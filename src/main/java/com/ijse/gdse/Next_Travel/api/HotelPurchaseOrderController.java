package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.hotel.HotelOrderDTO;
import com.ijse.gdse.Next_Travel.service.HotelPurchaseOrderService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/hotelOrder")
@CrossOrigin
public class HotelPurchaseOrderController {
    @Autowired
    HotelPurchaseOrderService purchaseOrderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrderHotel(@RequestBody HotelOrderDTO ordersDTO){
        purchaseOrderService.purchaseOrderHotel(ordersDTO);
        System.out.println(ordersDTO);
        return new ResponseUtil(200,"Success",ordersDTO);
    }
}
