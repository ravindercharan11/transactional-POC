package com.transacitonal.exampletransactional.repository;

import com.transacitonal.exampletransactional.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {

}
