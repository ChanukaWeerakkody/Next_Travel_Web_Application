package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.GuideOrderDTO;
import com.ijse.gdse.Next_Travel.dto.GuideOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.VehicleOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.entity.*;
import com.ijse.gdse.Next_Travel.repo.*;
import com.ijse.gdse.Next_Travel.service.GuidePurchaseOrderService;
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
public class GuidePurchaseOrderServiceImpl implements GuidePurchaseOrderService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    private GuideOrdersRepo ordersRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrderGuide(GuideOrderDTO dto) {
        Long oid = dto.getOid();
        String date = dto.getDate();
        UserDTO user = dto.getUser();
        User map = mapper.map(user, User.class);

        List<GuideOrderDetailsDTO> orderDetailsDtoList = dto.getOrdersDetails();
        List<GuideOrderDetails> orderDetailsList = orderDetailsDtoList.stream()
                .map(orderDetailsDto -> {
                    GuideOrderDetails orderDetails = new GuideOrderDetails();
                    orderDetails.setOid(orderDetailsDto.getOid());
                    orderDetails.setGuideId(orderDetailsDto.getGuideId());
                    orderDetails.setAmount(orderDetailsDto.getAmount());
                    return orderDetails;
                })
                .collect(Collectors.toList());

        GuideOrders orders = new GuideOrders();
        orders.setOid(oid);
        orders.setDate(date);
        orders.setUser(map);
        orders.setOrderDetails(orderDetailsList);

        ordersRepo.save(orders);
    }
}
