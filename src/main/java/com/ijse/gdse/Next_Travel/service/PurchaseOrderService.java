package com.ijse.gdse.Next_Travel.service;

import com.ijse.gdse.Next_Travel.dto.PurchaseOrderDTO;


import java.util.List;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/

public interface PurchaseOrderService {
    void savePurchaseOrder(PurchaseOrderDTO dto);
    void updatePurchaseOrder(PurchaseOrderDTO dto);
    void deletePurchaseOrder(Long id);
    PurchaseOrderDTO searchPurchaseOrderById(String id);
    List<PurchaseOrderDTO> getAllPurchaseOrderDetail();
}
