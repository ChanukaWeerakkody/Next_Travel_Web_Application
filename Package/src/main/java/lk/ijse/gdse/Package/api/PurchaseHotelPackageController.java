package lk.ijse.gdse.Package.api;

import lk.ijse.gdse.Package.dto.PurchaseHotelPackageDTO;
import lk.ijse.gdse.Package.service.PurchaseHotelPackageService;
import lk.ijse.gdse.Package.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/purchaseHotelPackage")
@CrossOrigin
public class PurchaseHotelPackageController {
    @Autowired
    PurchaseHotelPackageService hotelPackageService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveHotel(@ModelAttribute PurchaseHotelPackageDTO dto){
        hotelPackageService.savePurchaseHotelPackage(dto);
        return new ResponseUtil(200,"Success",dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllHotels(){
        return new ResponseUtil(200,"Success",hotelPackageService.getAllPurchaseHotelPackageDetail());
    }

    @PutMapping()
    public ResponseUtil updateHotel(@RequestBody PurchaseHotelPackageDTO dto){
        hotelPackageService.updatePurchaseHotelPackage(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"hotelId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteHotel(@RequestParam Long packageOid){
        hotelPackageService.deletePurchaseHotelPackage(packageOid);
        return new ResponseUtil(200,"Success",packageOid);
    }
}
