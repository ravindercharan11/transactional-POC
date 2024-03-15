package com.transacitonal.exampletransactional.service;

import com.transacitonal.exampletransactional.dto.FlightBookingAcknowledgement;
import com.transacitonal.exampletransactional.dto.FlightBookingRequest;
import com.transacitonal.exampletransactional.entity.PassengerInfo;
import com.transacitonal.exampletransactional.entity.PaymentInfo;
import com.transacitonal.exampletransactional.repository.PassengerInfoRepository;
import com.transacitonal.exampletransactional.repository.PaymentInfoRepository;
import com.transacitonal.exampletransactional.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
   @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){

        PassengerInfo passengerInfo= request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo= request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPID());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement
                ("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }
}
