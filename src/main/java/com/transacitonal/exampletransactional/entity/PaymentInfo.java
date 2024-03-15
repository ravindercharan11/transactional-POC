package com.transacitonal.exampletransactional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PAYMENT_INFO")
public class PaymentInfo {
    @Id
    @GeneratedValue
    @GenericGenerator(name="uuid2, strategy = org.hibernate.id.UUIDGenerator")
    private String PaymentId;
    private String accountNo;
     private double amount;
     private String cardType;
     private Long passengerId;
}
