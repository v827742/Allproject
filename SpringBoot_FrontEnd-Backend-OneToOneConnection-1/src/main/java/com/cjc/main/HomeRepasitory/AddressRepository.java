package com.cjc.main.HomeRepasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
