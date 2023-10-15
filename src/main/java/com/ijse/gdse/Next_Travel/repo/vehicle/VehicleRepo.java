package com.ijse.gdse.Next_Travel.repo.vehicle;

import com.ijse.gdse.Next_Travel.entity.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface VehicleRepo extends JpaRepository<Vehicle,Long> {
    @Modifying
    @Transactional
    @Query(value= "UPDATE Vehicle SET image1=:image1,image2=:image2, image3=:image3, image4=:image4 WHERE registerId=:id",nativeQuery=true)
    void updateVehicleFilePaths(@Param("image1")String image1, @Param("image2")String image2, @Param("image3")String image3, @Param("image4")String image4, @Param("id")String id);
}
