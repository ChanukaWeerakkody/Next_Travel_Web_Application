package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.guide.PurchaseGuideDTO;
import com.ijse.gdse.Next_Travel.dto.hotelPackage.PurchaseHotelPackageDTO;
import com.ijse.gdse.Next_Travel.entity.guide.PurchaseGuide;
import com.ijse.gdse.Next_Travel.entity.hotelPackage.PurchaseHotelPackage;
import com.ijse.gdse.Next_Travel.repo.guide.PurchaseGuideRepo;
import com.ijse.gdse.Next_Travel.repo.hotelPackage.PurchaseHotelPackageRepo;
import com.ijse.gdse.Next_Travel.service.PurchaseHotelPackageService;
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
public class PurchaseHotelPackageServiceImpl implements PurchaseHotelPackageService {
    @Autowired
    ModelMapper mapper;

    @Autowired
    PurchaseHotelPackageRepo hotelPackageRepo;

    @Override
    public void savePurchaseHotelPackage(PurchaseHotelPackageDTO dto) {
        hotelPackageRepo.save(mapper.map(dto, PurchaseHotelPackage.class));
    }

    @Override
    public void updatePurchaseHotelPackage(PurchaseHotelPackageDTO dto) {
        hotelPackageRepo.save(mapper.map(dto, PurchaseHotelPackage.class));
    }

    @Override
    public void deletePurchaseHotelPackage(Long id) {
        hotelPackageRepo.deleteById(id);
    }

    @Override
    public PurchaseHotelPackageDTO searchPurchaseHotelPackageById(String id) {
        return null;
    }

    @Override
    public List<PurchaseHotelPackageDTO> getAllPurchaseHotelPackageDetail() {
        return mapper.map(hotelPackageRepo.findAll(), new TypeToken<List<PurchaseHotelPackageDTO>>() {}.getType());
    }
}
