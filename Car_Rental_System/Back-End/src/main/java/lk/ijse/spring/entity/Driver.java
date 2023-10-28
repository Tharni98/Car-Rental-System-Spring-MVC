package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * author - Tharani
 * version - 1.0.0 1:21 PM 10/28/2023
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Driver {

    @Id

    private String licenceNo;
    private String name;
    private String address;
    private String contactNo;
    private String nicNo;
    private String username;
    private String password;
    private boolean availability;
}