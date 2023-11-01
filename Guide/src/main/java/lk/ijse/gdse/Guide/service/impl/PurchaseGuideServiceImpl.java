package lk.ijse.gdse.Guide.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.Guide.dto.PurchaseGuideDTO;
import lk.ijse.gdse.Guide.entity.PurchaseGuide;
import lk.ijse.gdse.Guide.repo.PurchaseGuideRepo;
import lk.ijse.gdse.Guide.service.PurchaseGuideService;
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
public class PurchaseGuideServiceImpl implements PurchaseGuideService {
    @Autowired
    ModelMapper mapper;

    @Autowired
    PurchaseGuideRepo guideRepo;

    @Override
    public void savePurchaseGuide(PurchaseGuideDTO dto) {
        guideRepo.save(mapper.map(dto, PurchaseGuide.class));
    }

    @Override
    public void updatePurchaseGuide(PurchaseGuideDTO dto) {
        guideRepo.save(mapper.map(dto, PurchaseGuide.class));
    }

    @Override
    public void deletePurchaseGuide(Long id) {
        guideRepo.deleteById(id);
    }

    @Override
    public PurchaseGuideDTO searchPurchaseGuideById(String id) {
        return null;
    }

    @Override
    public List<PurchaseGuideDTO> getAllPurchaseGuideDetail() {
        return mapper.map(guideRepo.findAll(), new TypeToken<List<PurchaseGuideDTO>>() {}.getType());
    }
}
