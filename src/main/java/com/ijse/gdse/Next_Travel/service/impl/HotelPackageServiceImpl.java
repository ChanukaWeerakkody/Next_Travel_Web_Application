package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.HotelPackageDTO;
import com.ijse.gdse.Next_Travel.entity.HotelPackage;
import com.ijse.gdse.Next_Travel.repo.HotelPackageRepo;
import com.ijse.gdse.Next_Travel.service.HotelPackageService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@Service
@Transactional
public class HotelPackageServiceImpl implements HotelPackageService {

    @Autowired
    HotelPackageRepo hotelPackageRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void savePackage(HotelPackageDTO dto) {
        hotelPackageRepo.save(modelMapper.map(dto, HotelPackage.class));
    }

    @Override
    public void deletePackage(Long id) {

    }

    @Override
    public void updatePackage(HotelPackageDTO dto) {

    }
}
