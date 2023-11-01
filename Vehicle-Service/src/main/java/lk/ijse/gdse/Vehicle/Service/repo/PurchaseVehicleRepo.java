package lk.ijse.gdse.Vehicle.Service.repo;

import lk.ijse.gdse.Vehicle.Service.entity.PurchaseVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseVehicleRepo extends JpaRepository<PurchaseVehicle,Long> {
    @Modifying
    @Transactional
    @Query(value= "UPDATE PurchaseVehicle SET image1=:image1,image2=:image2 WHERE vehicleOid=:vehicleOid",nativeQuery=true)
    void updatePurchaseVehicleFilePaths(@Param("image1")String image1, @Param("image2")String image2, @Param("vehicleOid")Long vehicleOid);
}
