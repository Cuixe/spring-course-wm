package com.walmart.api.cupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.api.cupon.model.Cupon;

public interface CuponRepository extends JpaRepository<Cupon, String> {


}
