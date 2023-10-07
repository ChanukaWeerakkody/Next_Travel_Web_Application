package com.ijse.gdse.Next_Travel.api;

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
    public ResponseEntity<String> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        Admin byUsername = adminRepo.findByUsername(username);

        if (byUsername != null && byUsername.getPassword().equals(password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
