package lk.ijse.gdse.Hotel.api;

import lk.ijse.gdse.Hotel.dto.PurchaseHotelDTO;
import lk.ijse.gdse.Hotel.service.PurchaseHotelService;
import lk.ijse.gdse.Hotel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/purchaseHotel")
@CrossOrigin
public class PurchaseHotelController {
    @Autowired
    PurchaseHotelService hotelService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveHotel(@ModelAttribute PurchaseHotelDTO dto){
        hotelService.savePurchaseHotel(dto);
        return new ResponseUtil(200,"Success",dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllHotels(){
        return new ResponseUtil(200,"Success",hotelService.getAllPurchaseHotelDetail());
    }

    @PutMapping()
    public ResponseUtil updateHotel(@RequestBody PurchaseHotelDTO dto){
        hotelService.updatePurchaseHotel(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"hotelId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteHotel(@RequestParam Long hotelOid){
        hotelService.deletePurchaseHotel(hotelOid);
        return new ResponseUtil(200,"Success",hotelOid);
    }
}
