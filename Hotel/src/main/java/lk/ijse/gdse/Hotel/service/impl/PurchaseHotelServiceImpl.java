package lk.ijse.gdse.Hotel.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.Hotel.dto.PurchaseHotelDTO;
import lk.ijse.gdse.Hotel.entity.PurchaseHotel;
import lk.ijse.gdse.Hotel.repo.PurchaseHotelRepo;
import lk.ijse.gdse.Hotel.service.PurchaseHotelService;
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
public class PurchaseHotelServiceImpl implements PurchaseHotelService {
    @Autowired
    ModelMapper mapper;

    @Autowired
    PurchaseHotelRepo hotelRepo;

    @Override
    public void savePurchaseHotel(PurchaseHotelDTO dto) {
        hotelRepo.save(mapper.map(dto, PurchaseHotel.class));
    }

    @Override
    public void updatePurchaseHotel(PurchaseHotelDTO dto) {
        hotelRepo.save(mapper.map(dto, PurchaseHotel.class));
    }

    @Override
    public void deletePurchaseHotel(Long id) {
        hotelRepo.deleteById(id);
    }

    @Override
    public PurchaseHotelDTO searchPurchaseHotelById(String id) {
        return null;
    }

    @Override
    public List<PurchaseHotelDTO> getAllPurchaseHotelDetail() {
        return mapper.map(hotelRepo.findAll(), new TypeToken<List<PurchaseHotelDTO>>() {}.getType());
    }
}
