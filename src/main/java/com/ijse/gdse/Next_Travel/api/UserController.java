package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.entity.User;
import com.ijse.gdse.Next_Travel.repo.UserRepo;
import com.ijse.gdse.Next_Travel.service.UserService;
import com.ijse.gdse.Next_Travel.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil addUser(@RequestPart("userFiles") MultipartFile[] file, @RequestPart("user") UserDTO userDTO) {

        for (MultipartFile myFile : file) {
            try {
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                File uploadsDir = new File(projectPath + "/uploads");
                uploadsDir.mkdir();
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                System.out.println(projectPath);
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
                return new ResponseUtil(500, "Registration Failed.Try Again Latter", null);
            }
        }
        userService.saveUser(userDTO);
        return new ResponseUtil(200, "Registration Successfully....", userDTO);
    }


    @PostMapping(path = "/uploadImg/{id}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil uploadImagesAndPath(@RequestPart("image1") MultipartFile image1, @RequestPart("image2") MultipartFile image2, @PathVariable String id) {
        try {
            System.out.println(image1.getOriginalFilename());
            System.out.println("Upload Image");

            String projectPath = String.valueOf(new File("E:\\imageSave\\uploads"));
            File uploadsDir = new File(projectPath + "\\carImage");
            uploadsDir.mkdir();

            image1.transferTo(new File(uploadsDir.getAbsolutePath() + "\\" + image1.getOriginalFilename()));
            image2.transferTo(new File(uploadsDir.getAbsolutePath() + "\\" + image2.getOriginalFilename()));

            String frontViewPath = projectPath + "\\carImage" + image1.getOriginalFilename();
            String backViewPath = projectPath + "\\carImage" + image2.getOriginalFilename();



            userService.uploadUserImage(frontViewPath, backViewPath,id);

            return new ResponseUtil(200, "Uploaded", null);

        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseUtil(500,e.getMessage(),null);
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllUsers(){
        return new ResponseUtil(200,"Success",userService.getAllUserDetail());
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();

        User user = userRepo.findByUsername(username);

        if (user == null) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }

        if (!user.getPassword().equals(password)) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
        return ResponseEntity.ok("Login successful");
    }

    @PutMapping()
    public ResponseUtil updateGuide(@RequestBody UserDTO dto){
        userService.updateUser(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }


    @DeleteMapping(params = {"userId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteGuide(@RequestParam Long userId){
        userService.deleteUser(userId);
        return new ResponseUtil(200,"Success",userId);
    }
}
