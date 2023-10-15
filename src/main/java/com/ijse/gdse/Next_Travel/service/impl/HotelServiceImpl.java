package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.hotel.HotelDTO;
import com.ijse.gdse.Next_Travel.entity.hotel.Hotel;
import com.ijse.gdse.Next_Travel.repo.hotel.HotelRepo;
import com.ijse.gdse.Next_Travel.service.HotelService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepo hotelRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveHotel(HotelDTO dto) {
        hotelRepo.save(mapper.map(dto, Hotel.class));
    }

    @Override
    public void updateHotel(HotelDTO dto) {
        hotelRepo.save(mapper.map(dto, Hotel.class));
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepo.deleteById(id);
    }

    @Override
    public HotelDTO searchHotelById(String id) {
        return null;
    }

    @Override
    public List<HotelDTO> getAllHotelDetail() {
        return mapper.map(hotelRepo.findAll(), new TypeToken<List<HotelDTO>>() {}.getType());
    }
}
