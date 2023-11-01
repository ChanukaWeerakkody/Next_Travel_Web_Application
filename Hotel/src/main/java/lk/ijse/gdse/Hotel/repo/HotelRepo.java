package lk.ijse.gdse.Hotel.repo;

import lk.ijse.gdse.Hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface HotelRepo extends JpaRepository<Hotel,Long> {
}
