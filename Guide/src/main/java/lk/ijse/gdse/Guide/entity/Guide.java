package lk.ijse.gdse.Guide.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Chanuka Weerakkody
 * @since : 20.1.1
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guideId;
    @NotBlank(message = "Name shouldn't be null or empty")
    private String fullName;
    @NotBlank(message = "Address shouldn't be null or empty")
    private String address;
    @NotBlank(message = "Age shouldn't be null or empty")
    private int age;
    @NotBlank(message = "Contact shouldn't be null or empty")
    private int contactNumber;
    @NotBlank(message = "Gender shouldn't be null or empty")
    private String gender;
    private String experience;
    @NotBlank(message = "Price shouldn't be null or empty")
    private double price;

    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
}
