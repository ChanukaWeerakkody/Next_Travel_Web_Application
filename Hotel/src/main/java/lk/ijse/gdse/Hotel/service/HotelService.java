package lk.ijse.gdse.Hotel.service;

import lk.ijse.gdse.Hotel.dto.HotelDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelService {
    void saveHotel(HotelDTO dto);
    void updateHotel(HotelDTO dto);
    void deleteHotel(Long id);
    HotelDTO searchHotelById(String id);
    List<HotelDTO> getAllHotelDetail();
}
