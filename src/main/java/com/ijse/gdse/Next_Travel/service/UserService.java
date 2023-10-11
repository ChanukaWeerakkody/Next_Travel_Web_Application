package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.VehicleDTO;

import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface UserService {
    void saveUser(UserDTO dto);
    void uploadUserImage(String frontViewPath, String backViewPath, String id);
    void updateUser(UserDTO dto);
    void deleteUser(Long id);
    UserDTO searchUserById(String id);
    List<UserDTO> getAllUserDetail();
}
