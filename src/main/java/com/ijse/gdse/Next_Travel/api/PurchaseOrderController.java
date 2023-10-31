package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.PurchaseOrderDTO;
import com.ijse.gdse.Next_Travel.service.PurchaseOrderService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/purchaseOrder")
@CrossOrigin
public class PurchaseOrderController {
    @Autowired
    PurchaseOrderService orderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveOrder(@ModelAttribute PurchaseOrderDTO dto){
        orderService.savePurchaseOrder(dto);
        return new ResponseUtil(200,"Success",dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllOrders(){
        return new ResponseUtil(200,"Success",orderService.getAllPurchaseOrderDetail());
    }

    @PutMapping()
    public ResponseUtil updateOrder(@RequestBody PurchaseOrderDTO dto){
        orderService.updatePurchaseOrder(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"hotelId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteOrder(@RequestParam Long hotelId){
        orderService.deletePurchaseOrder(hotelId);
        return new ResponseUtil(200,"Success",hotelId);
    }
}
