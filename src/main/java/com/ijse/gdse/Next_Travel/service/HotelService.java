package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.hotel.HotelDTO;

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
