package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.UserDTO;
import com.ijse.gdse.Next_Travel.dto.guide.GuideOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.dto.hotelPackage.HotelPackageOrderDTO;
import com.ijse.gdse.Next_Travel.dto.hotelPackage.HotelPackageOrderDetailsDTO;
import com.ijse.gdse.Next_Travel.entity.User;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrderDetails;
import com.ijse.gdse.Next_Travel.entity.guide.GuideOrders;
import com.ijse.gdse.Next_Travel.entity.hotelPackage.HotelPackageOrderDetails;
import com.ijse.gdse.Next_Travel.entity.hotelPackage.HotelPackageOrders;
import com.ijse.gdse.Next_Travel.repo.UserRepo;
import com.ijse.gdse.Next_Travel.repo.guide.GuideOrdersRepo;
import com.ijse.gdse.Next_Travel.repo.hotelPackage.HotelPackageOrdersRepo;
import com.ijse.gdse.Next_Travel.service.HotelPackagePurchaseOrderService;
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
public class HotelPackagePurchaseOrderServiceImpl implements HotelPackagePurchaseOrderService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    private HotelPackageOrdersRepo ordersRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrder(HotelPackageOrderDTO dto) {
        Long oid = dto.getOid();
        String date = dto.getDate();
        UserDTO user = dto.getUser();
        User map = mapper.map(user, User.class);

        List<HotelPackageOrderDetailsDTO> orderDetailsDtoList = dto.getOrdersDetails();
        List<HotelPackageOrderDetails> orderDetailsList = orderDetailsDtoList.stream()
                .map(orderDetailsDto -> {
                    HotelPackageOrderDetails orderDetails = new HotelPackageOrderDetails();
                    orderDetails.setOid(orderDetailsDto.getOid());
                    orderDetails.setPackageId(orderDetailsDto.getPackageId());
                    orderDetails.setAmount(orderDetailsDto.getAmount());
                    return orderDetails;
                })
                .collect(Collectors.toList());

        HotelPackageOrders orders = new HotelPackageOrders();
        orders.setOid(oid);
        orders.setDate(date);
        orders.setUser(map);
        orders.setOrderDetails(orderDetailsList);

        ordersRepo.save(orders);
    }
}
