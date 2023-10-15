package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.VehicleOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.dto.VehicleOrdersDTO;
import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.entity.*;
import com.ijse.gdse.Next_Travel.repo.VehicleOrderDetailsRepo;
import com.ijse.gdse.Next_Travel.repo.VehicleOrdersRepo;
import com.ijse.gdse.Next_Travel.repo.UserRepo;
import com.ijse.gdse.Next_Travel.repo.VehicleRepo;
import com.ijse.gdse.Next_Travel.service.VehiclePurchaseOrderService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@Service
@Transactional
public class VehiclePurchaseOrderServiceImpl implements VehiclePurchaseOrderService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    private VehicleOrdersRepo ordersRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrder(VehicleOrdersDTO dto) {
        Long oid = dto.getOid();
        String date = dto.getDate();
        UserDTO user = dto.getUser();
        User map = mapper.map(user, User.class);

        List<VehicleOrderDetailsDTO> orderDetailsDtoList = dto.getOrdersDetails();
        List<VehicleOrderDetails> orderDetailsList = orderDetailsDtoList.stream()
                .map(orderDetailsDto -> {
                    VehicleOrderDetails orderDetails = new VehicleOrderDetails();
                    orderDetails.setOid(orderDetailsDto.getOid());
                    orderDetails.setVehicleId(orderDetailsDto.getVehicleId());
                    orderDetails.setAmount(orderDetailsDto.getAmount());
                    return orderDetails;
                })
                .collect(Collectors.toList());

        VehicleOrders orders = new VehicleOrders();
        orders.setOid(oid);
        orders.setDate(date);
        orders.setUser(map);
        orders.setOrderDetails(orderDetailsList);

        ordersRepo.save(orders);

    }
}
