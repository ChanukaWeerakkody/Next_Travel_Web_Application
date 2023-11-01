package lk.ijse.gdse.Package.repo;

import lk.ijse.gdse.Package.entity.HotelPackage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelPackageRepo extends JpaRepository<HotelPackage,Long> {
}
