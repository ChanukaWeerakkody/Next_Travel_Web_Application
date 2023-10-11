package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.VehicleDTO;
import com.ijse.gdse.Next_Travel.entity.User;
import com.ijse.gdse.Next_Travel.entity.Vehicle;
import com.ijse.gdse.Next_Travel.repo.UserRepo;
import com.ijse.gdse.Next_Travel.service.UserService;
import jakarta.transaction.Transactional;
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
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveUser(UserDTO dto) {
        userRepo.save(mapper.map(dto, User.class));
    }

    @Override
    public void uploadUserImage(String frontPath, String BackPath, String id) {
        System.out.println("Car Impl-if");
        userRepo.updateUserFilePaths(frontPath, BackPath, id);
    }

    @Override
    public void updateUser(UserDTO dto) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserDTO searchUserById(String id) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUserDetail() {
        return mapper.map(userRepo.findAll(), new TypeToken<List<UserDTO>>() {}.getType());
    }
}
