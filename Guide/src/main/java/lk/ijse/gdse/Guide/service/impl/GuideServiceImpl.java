package lk.ijse.gdse.Guide.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.Guide.dto.GuideDTO;
import lk.ijse.gdse.Guide.entity.Guide;
import lk.ijse.gdse.Guide.repo.GuideRepo;
import lk.ijse.gdse.Guide.service.GuideService;
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
public class GuideServiceImpl implements GuideService {

    @Autowired
    GuideRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void saveGuide(GuideDTO dto) {
        repo.save(mapper.map(dto, Guide.class));
    }

    @Override
    public void uploadCarImage(String frontPath, String BackPath, String sidePath, String InteriorPath,String guideImage, String name) {
        System.out.println("Car Impl-if");
        repo.updateCarFilePaths(frontPath, BackPath, sidePath,InteriorPath,guideImage, name);
    }

    @Override
    public void updateGuide(GuideDTO dto) {
        repo.save(mapper.map(dto, Guide.class));
    }

    @Override
    public void deleteGuide(Long id) {
        repo.deleteById(id);
    }

    @Override
    public GuideDTO searchGuideById(String guideId) {
        return null;
    }

    @Override
    public List<GuideDTO> getAllGuideDetail() {
        return mapper.map(repo.findAll(), new TypeToken<List<GuideDTO>>() {}.getType());
    }


}
