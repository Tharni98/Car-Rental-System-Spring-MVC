package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * author - Tharani
 * version - 1.0.0 10:24 PM 11/1/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Maintenance {
    @Id
    private String maintenanceId;
    private String date;
    private String details;
    private double cost;

    @ManyToOne
    @JoinColumn(name = "registrationNO", referencedColumnName = "registrationNO", nullable = false)
    private Car car;
}
