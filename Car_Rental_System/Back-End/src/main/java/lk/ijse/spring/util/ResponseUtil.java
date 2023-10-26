package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 3:10 PM 10/25/2023
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {

    private int code;

    private String massage;

    private Object data;
}
