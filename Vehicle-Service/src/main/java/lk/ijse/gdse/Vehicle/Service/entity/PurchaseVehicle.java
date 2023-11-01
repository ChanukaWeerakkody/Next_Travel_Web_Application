package lk.ijse.gdse.Vehicle.Service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class PurchaseVehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
