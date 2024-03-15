package com.transacitonal.exampletransactional.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PASSENGER INFO")
public class PassengerInfo {
    @Id
    @GeneratedValue
    private Long pID;
    private String name;
    private String email;
    private String source;
    private String Destination;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;


}
