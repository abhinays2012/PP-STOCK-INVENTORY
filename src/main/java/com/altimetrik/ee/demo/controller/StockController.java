package com.altimetrik.ee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.entity.Stock;
import com.altimetrik.ee.demo.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {

	@Autowired
	private StockService stockService;

	@Autowired

	@RequestMapping("")
	public Iterable<Stock> getAllStock() {
		return stockService.findAll();
	}

	@RequestMapping(method = RequestMethod.POST, value = "")
	public void addStock(@RequestBody Stock stock) {
		stockService.insert(stock);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateStock(@RequestBody Stock stock) {
		stockService.updateStock(stock);
	}

}
