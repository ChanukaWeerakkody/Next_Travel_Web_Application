package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.guide.GuideOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.dto.hotel.HotelOrderDTO;
import com.ijse.gdse.Next_Travel.dto.hotel.HotelOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.entity.User;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrderDetails;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrders;
import com.ijse.gdse.Next_Travel.entity.hotel.HotelOrderDetails;
import com.ijse.gdse.Next_Travel.entity.hotel.HotelOrders;
import com.ijse.gdse.Next_Travel.repo.UserRepo;
import com.ijse.gdse.Next_Travel.repo.guide.GuideOrdersRepo;
import com.ijse.gdse.Next_Travel.repo.hotel.HotelOrdersRepo;
import com.ijse.gdse.Next_Travel.service.HotelPurchaseOrderService;
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
public class HotelPurchaseOrderServiceImpl implements HotelPurchaseOrderService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    private HotelOrdersRepo ordersRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrderHotel(HotelOrderDTO dto) {
        Long oid = dto.getOid();
        String date = dto.getDate();
        UserDTO user = dto.getUser();
        User map = mapper.map(user, User.class);

        List<HotelOrderDetailsDTO> orderDetailsDtoList = dto.getOrdersDetails();
        List<HotelOrderDetails> orderDetailsList = orderDetailsDtoList.stream()
                .map(orderDetailsDto -> {
                    HotelOrderDetails orderDetails = new HotelOrderDetails();
                    orderDetails.setOid(orderDetailsDto.getOid());
                    orderDetails.setHotelId(orderDetailsDto.getHotelId());
                    orderDetails.setAmount(orderDetailsDto.getAmount());
                    return orderDetails;
                })
                .collect(Collectors.toList());

        HotelOrders orders = new HotelOrders();
        orders.setOid(oid);
        orders.setDate(date);
        orders.setUser(map);
        orders.setOrderDetails(orderDetailsList);

        ordersRepo.save(orders);
    }
}
