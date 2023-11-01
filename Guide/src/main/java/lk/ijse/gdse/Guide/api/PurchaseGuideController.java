package lk.ijse.gdse.Guide.api;

import lk.ijse.gdse.Guide.dto.PurchaseGuideDTO;
import lk.ijse.gdse.Guide.service.PurchaseGuideService;
import lk.ijse.gdse.Guide.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/purchaseGuide")
@CrossOrigin
public class PurchaseGuideController {
    @Autowired
    PurchaseGuideService guideService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveHotel(@ModelAttribute PurchaseGuideDTO dto){
        guideService.savePurchaseGuide(dto);
        return new ResponseUtil(200,"Success",dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllHotels(){
        return new ResponseUtil(200,"Success",guideService.getAllPurchaseGuideDetail());
    }

    @PutMapping()
    public ResponseUtil updateHotel(@RequestBody PurchaseGuideDTO dto){
        guideService.updatePurchaseGuide(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"hotelId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteHotel(@RequestParam Long guideOid){
        guideService.deletePurchaseGuide(guideOid);
        return new ResponseUtil(200,"Success",guideOid);
    }
}
