package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 1:19 PM 10/28/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {

    private String licenceNo;

    private String name;

    private String address;

    private String contactNo;

    private String nicNo;

    private String username;

    private String password;

    private boolean availability;
}
