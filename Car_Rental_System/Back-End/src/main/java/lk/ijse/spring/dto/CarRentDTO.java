package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 9:18 PM 11/1/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarRentDTO {

    private String rentId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String pickUpDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String returnDate;

    private String status;

    private CustomerDTO customer;

    private CarDTO car;

    private DriverDTO  driver;
}
