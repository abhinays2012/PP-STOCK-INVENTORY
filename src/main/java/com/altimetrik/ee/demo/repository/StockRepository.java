package com.altimetrik.ee.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.altimetrik.ee.demo.entity.Stock;

public interface StockRepository extends CrudRepository<Stock,Integer> {
}
