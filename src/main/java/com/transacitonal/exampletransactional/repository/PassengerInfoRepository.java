package com.transacitonal.exampletransactional.repository;

import com.transacitonal.exampletransactional.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
