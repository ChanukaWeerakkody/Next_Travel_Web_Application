package com.ijse.gdse.Next_Travel.service.impl;

import com.ijse.gdse.Next_Travel.dto.PurchaseOrderDTO;

import com.ijse.gdse.Next_Travel.entity.PurchaseOrder;
import com.ijse.gdse.Next_Travel.repo.PurchaseOrderRepo;
import com.ijse.gdse.Next_Travel.service.PurchaseOrderService;
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
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    ModelMapper mapper;

    @Autowired
    PurchaseOrderRepo orderRepo;

    @Override
    public void savePurchaseOrder(PurchaseOrderDTO dto) {
        orderRepo.save(mapper.map(dto, PurchaseOrder.class));
    }

    @Override
    public void updatePurchaseOrder(PurchaseOrderDTO dto) {
        orderRepo.save(mapper.map(dto, PurchaseOrder.class));
    }

    @Override
    public void deletePurchaseOrder(Long id) {
        orderRepo.deleteById(id);
    }

    @Override
    public PurchaseOrderDTO searchPurchaseOrderById(String id) {
        return null;
    }

    @Override
    public List<PurchaseOrderDTO> getAllPurchaseOrderDetail() {
        return mapper.map(orderRepo.findAll(), new TypeToken<List<PurchaseOrderDTO>>() {}.getType());
    }
}
