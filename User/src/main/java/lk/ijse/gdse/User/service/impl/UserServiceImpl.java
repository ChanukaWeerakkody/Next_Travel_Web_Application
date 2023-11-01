package lk.ijse.gdse.User.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.User.dto.UserDTO;
import lk.ijse.gdse.User.entity.User;
import lk.ijse.gdse.User.repo.UserRepo;
import lk.ijse.gdse.User.service.UserService;
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
        userRepo.save(mapper.map(dto, User.class));
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
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
