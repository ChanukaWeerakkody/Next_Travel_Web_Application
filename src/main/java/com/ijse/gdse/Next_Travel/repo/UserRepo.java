package com.ijse.gdse.Next_Travel.repo;

import com.ijse.gdse.Next_Travel.entity.Admin;
import com.ijse.gdse.Next_Travel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface UserRepo extends JpaRepository<User,Long> {
    @Modifying
    @Transactional
    @Query(value= "UPDATE User SET image1=:image1,image2=:image2 WHERE userId=:id",nativeQuery=true)
    void updateUserFilePaths(@Param("image1")String image1, @Param("image2")String image2, @Param("id")String id);

    User findByUsername(String username);
}
