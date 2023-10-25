package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.hotelPackage.HotelPackageOrderDTO;
import com.ijse.gdse.Next_Travel.service.HotelPackagePurchaseOrderService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/packageOrder")
@CrossOrigin
public class HotelPackagePurchaseOrderController {
    @Autowired
    HotelPackagePurchaseOrderService purchaseOrderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrderGuide(@RequestBody HotelPackageOrderDTO ordersDTO){
        purchaseOrderService.purchaseOrder(ordersDTO);
        System.out.println(ordersDTO);
        return new ResponseUtil(200,"Success",ordersDTO);
    }
}
