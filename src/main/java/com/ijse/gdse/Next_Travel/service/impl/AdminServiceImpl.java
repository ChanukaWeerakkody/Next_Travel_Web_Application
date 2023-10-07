package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.repo.AdminRepo;
import com.ijse.gdse.Next_Travel.service.AdminService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    ModelMapper modelMapper;


}
