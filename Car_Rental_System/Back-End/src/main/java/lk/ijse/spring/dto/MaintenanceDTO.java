package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author - Tharani
 * version - 1.0.0 10:21 PM 11/1/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MaintenanceDTO {

    private String maintenanceId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private String details;
    private CarDTO car;
    private double cost;
}
