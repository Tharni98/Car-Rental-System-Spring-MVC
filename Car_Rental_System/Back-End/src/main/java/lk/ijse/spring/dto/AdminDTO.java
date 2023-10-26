package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 11:07 PM 10/26/2023
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {

    private String adminId;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String username;
    private String password;
}
