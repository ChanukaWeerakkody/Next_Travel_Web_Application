package lk.ijse.gdse.Guide.dto;

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
public class PurchaseGuideDTO implements Serializable {
    private Long guideOid;
    private Long guideId;
    private double pricePerDay;
    private int days;
    private double fullPrice;
    private String userId;
}
