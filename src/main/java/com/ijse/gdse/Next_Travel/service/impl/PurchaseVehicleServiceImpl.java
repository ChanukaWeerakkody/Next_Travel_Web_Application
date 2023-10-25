package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.vehicle.PurchaseVehicleDTO;
import com.ijse.gdse.Next_Travel.entity.vehicle.PurchaseVehicle;
import com.ijse.gdse.Next_Travel.repo.vehicle.PurchaseVehicleRepo;
import com.ijse.gdse.Next_Travel.service.PurchaseVehicleService;
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
public class PurchaseVehicleServiceImpl implements PurchaseVehicleService {
    @Autowired
    PurchaseVehicleRepo purchaseVehicleRepo;

    @Autowired
    ModelMapper mapper;
    @Override
    public void savePurchaseVehicle(PurchaseVehicleDTO dto) {
        purchaseVehicleRepo.save(mapper.map(dto, PurchaseVehicle.class));
    }

    @Override
    public void updatePurchaseVehicle(PurchaseVehicleDTO dto) {
        purchaseVehicleRepo.save(mapper.map(dto, PurchaseVehicle.class));
    }

    @Override
    public void deletePurchaseVehicle(Long id) {
        purchaseVehicleRepo.deleteById(id);
    }

    @Override
    public PurchaseVehicleDTO searchPurchaseVehicleById(String id) {
        return null;
    }

    @Override
    public List<PurchaseVehicleDTO> getAllPurchaseVehicleDetail() {
        return mapper.map(purchaseVehicleRepo.findAll(), new TypeToken<List<PurchaseVehicleDTO>>() {}.getType());
    }

    @Override
    public void uploadVehicleImage(String frontPath, String BackPath, Long id) {
        System.out.println("Car Impl-if");
        purchaseVehicleRepo.updatePurchaseVehicleFilePaths(frontPath, BackPath, id);
    }
}
