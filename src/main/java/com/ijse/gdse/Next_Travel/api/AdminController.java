package com.ijse.gdse.Next_Travel.api;

import com.ijse.gdse.Next_Travel.dto.AdminDTO;
import com.ijse.gdse.Next_Travel.entity.Admin;
import com.ijse.gdse.Next_Travel.repo.AdminRepo;
import com.ijse.gdse.Next_Travel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    AdminRepo adminRepo;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AdminDTO adminDTO) {
        String username = adminDTO.getUsername();
        String category = adminDTO.getCategory();
        String password = adminDTO.getPassword();

        Admin admin = adminRepo.findByUsername(username);

        if (admin == null) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }

        if (!admin.getPassword().equals(password) || !admin.getCategory().equals(category)) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
        return ResponseEntity.ok("Login successful");
    }
}
