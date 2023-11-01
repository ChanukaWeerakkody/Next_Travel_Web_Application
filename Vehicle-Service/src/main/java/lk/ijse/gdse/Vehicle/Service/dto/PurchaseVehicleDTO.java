package lk.ijse.gdse.Vehicle.Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PurchaseVehicleDTO implements Serializable {
    private Long vehicleOid;
    private Long vehicleId;
    private String driverName;
    private int driverContact;
    private String image1;
    private String image2;
    private double pricePerKm;
    private int km;
    private double fullPrice;
    private String userId;
}
