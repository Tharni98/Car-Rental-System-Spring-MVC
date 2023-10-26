package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 12:35 PM 10/26/2023
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoginDTO {
    private String loginId;

    private String username;

    private String password;

    private String role;
}
