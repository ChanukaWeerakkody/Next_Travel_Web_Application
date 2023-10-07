package com.ijse.gdse.Next_Travel.repo;

import com.ijse.gdse.Next_Travel.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface GuideRepo extends JpaRepository<Guide,Long> {

    @Modifying
    @Transactional
    @Query(value= "UPDATE Guide SET image1=:image1,image2=:image2, image3=:image3, image4=:image4, image5=:image5 WHERE fullName=:name",nativeQuery=true)
    void updateCarFilePaths(@Param("image1")String image1, @Param("image2")String image2, @Param("image3")String image3, @Param("image4")String image4, @Param("image5")String image5, @Param("name")String name);

}
