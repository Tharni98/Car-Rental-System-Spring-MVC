package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 10:06 PM 10/31/2023
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDTO {

    private String registrationNO;

    private String brand;

    private String type;

    private int noOfPassengers;

    private String transmissionType;

    private String fuelType;

    private String color;

    private String frontView;

    private String backView;

    private String sideView;

    private String internalView;

    private double dailyRate;

    private double monthlyRate;

    private double freeKmForPrice;

    private double freeKmForDuration;

    private double lossDamageWaiver;

    private double priceForExtraKm;

    private double completeKm;

    private String status;
}
