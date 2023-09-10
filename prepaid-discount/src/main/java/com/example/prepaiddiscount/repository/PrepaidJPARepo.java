package com.example.prepaiddiscount.repository;

import com.example.prepaiddiscount.entity.PrepaidDiscountJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrepaidJPARepo extends JpaRepository<PrepaidDiscountJPA,Integer> {

    List<PrepaidDiscountJPA> findAllByIsDeletedTrue();
}
