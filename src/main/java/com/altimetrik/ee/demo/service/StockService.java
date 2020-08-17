package com.altimetrik.ee.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.Stock;
import com.altimetrik.ee.demo.repository.StockRepository;

@Transactional
@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	public void insert(Stock stock) {
		stockRepository.save(stock);
	}


	public Iterable<Stock> findAll() {
		return stockRepository.findAll();
	}

	public void updateStock(Stock stock) {
		stockRepository.save(stock);
	}


}
