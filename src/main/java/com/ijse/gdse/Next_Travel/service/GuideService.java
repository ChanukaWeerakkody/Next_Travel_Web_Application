package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.GuideDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface GuideService {
    void saveGuide(GuideDTO dto);
    void uploadCarImage(String carFrontViewPath, String carBackViewPath, String carSideViewPath, String carInteriorViewPath,String guideImage, String name);

    void updateGuide(GuideDTO dto);
    void deleteGuide(Long id);
    GuideDTO searchGuideById(String guideId);
    List<GuideDTO> getAllGuideDetail();

}
