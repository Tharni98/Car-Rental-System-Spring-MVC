package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * author - Tharani
 * version - 1.0.0 10:14 PM 10/31/2023
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Car {

    @Id
    private String registrationNO;

    private String brand;

    private String type;

    private int noOfPassengers;

    private String transmissionType;

    private String fuelType;

    private String color;

    private String frontViewImg;

    private String backViewImg;

    private String sideViewImg;

    private String internalViewImg;

    private double dailyRate;

    private double monthlyRate;

    private double freeKmForPrice;

    private double freeKmForDuration;

    private double lossDamageWaiver;

    private double priceForExtraKm;

    private double completeKm;

    private String status;


}
