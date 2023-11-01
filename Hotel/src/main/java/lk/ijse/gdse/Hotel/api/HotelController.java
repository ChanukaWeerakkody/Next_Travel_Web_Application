package lk.ijse.gdse.Hotel.api;


import lk.ijse.gdse.Hotel.dto.HotelDTO;
import lk.ijse.gdse.Hotel.service.HotelService;
import lk.ijse.gdse.Hotel.util.ResponseUtil;
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
    public ResponseUtil saveHotel(@ModelAttribute HotelDTO hotelDTO){
        hotelService.saveHotel(hotelDTO);
        return new ResponseUtil(200,"Success",hotelDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllHotels(){
        return new ResponseUtil(200,"Success",hotelService.getAllHotelDetail());
    }

    @PutMapping()
    public ResponseUtil updateHotel(@RequestBody HotelDTO dto){
        hotelService.updateHotel(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"hotelId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteHotel(@RequestParam Long hotelId){
        hotelService.deleteHotel(hotelId);
        return new ResponseUtil(200,"Success",hotelId);
    }
}
