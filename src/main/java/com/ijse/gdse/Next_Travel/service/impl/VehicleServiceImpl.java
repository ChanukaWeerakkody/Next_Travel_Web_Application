package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.vehicle.VehicleDTO;
import com.ijse.gdse.Next_Travel.entity.vehicle.Vehicle;
import com.ijse.gdse.Next_Travel.repo.vehicle.VehicleRepo;
import com.ijse.gdse.Next_Travel.service.VehicleService;
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
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepo vehicleRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveVehicle(VehicleDTO dto) {
        vehicleRepo.save(mapper.map(dto, Vehicle.class));
    }

    @Override
    public void uploadVehicleImage(String frontPath, String BackPath, String sidePath, String InteriorPath, String id) {
        System.out.println("Car Impl-if");
        vehicleRepo.updateVehicleFilePaths(frontPath, BackPath, sidePath,InteriorPath, id);
    }

    @Override
    public void updateVehicle(VehicleDTO dto) {
        vehicleRepo.save(mapper.map(dto, Vehicle.class));
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepo.deleteById(id);
    }

    @Override
    public VehicleDTO searchVehicleById(String id) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicleDetail() {
        return mapper.map(vehicleRepo.findAll(), new TypeToken<List<VehicleDTO>>() {}.getType());
    }
}
