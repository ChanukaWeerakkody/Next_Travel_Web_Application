package lk.ijse.gdse.Package.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.Package.dto.HotelPackageDTO;
import lk.ijse.gdse.Package.entity.HotelPackage;
import lk.ijse.gdse.Package.repo.HotelPackageRepo;
import lk.ijse.gdse.Package.service.HotelPackageService;
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
        hotelPackageRepo.deleteById(id);
    }

    @Override
    public void updatePackage(HotelPackageDTO dto) {
        hotelPackageRepo.save(modelMapper.map(dto, HotelPackage.class));
    }

    @Override
    public List<HotelPackage> getAllHotelPackageDetail() {
        return modelMapper.map(hotelPackageRepo.findAll(), new TypeToken<List<HotelPackageDTO>>() {}.getType());
    }
}
