package com.soprasteria.entitymapping.Repository;

import com.soprasteria.entitymapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends JpaRepository<Address, Long> {}
