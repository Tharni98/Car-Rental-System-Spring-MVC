package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * author - Tharani
 * version - 1.0.0 10:06 PM 11/1/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class CarRentReturn {
    @Id
    private String returnId;
    private String date;
    private double noOfKm;

    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "rentId", referencedColumnName = "rentId", nullable = false)
    private CarRent rental;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentId", referencedColumnName = "paymentId", nullable = false)
    private Payment payment;
}
