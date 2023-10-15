package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.VehicleOrdersDTO;
import com.ijse.gdse.Next_Travel.service.VehiclePurchaseOrderService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/order")
@CrossOrigin
public class VehiclePurchaseOrderController {
    @Autowired
    VehiclePurchaseOrderService purchaseOrderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseOrder(@RequestBody VehicleOrdersDTO ordersDTO){
        purchaseOrderService.purchaseOrder(ordersDTO);
        System.out.println(ordersDTO);
        return new ResponseUtil(200,"Success",ordersDTO);
    }
}
