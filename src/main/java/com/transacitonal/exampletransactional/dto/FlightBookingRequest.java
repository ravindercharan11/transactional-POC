package com.transacitonal.exampletransactional.dto;

import com.transacitonal.exampletransactional.entity.PassengerInfo;
import com.transacitonal.exampletransactional.entity.PaymentInfo;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
