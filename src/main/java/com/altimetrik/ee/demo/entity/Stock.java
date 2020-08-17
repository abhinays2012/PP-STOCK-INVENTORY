package com.altimetrik.ee.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s")
public class Stock {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stockId;

	@ManyToOne
	@JoinColumn(name = "productId")
	private int stock_Number;
	@ManyToOne
	@JoinColumn(name = "productId")
	private String stock_Name;
	private float purchasingPrice;
	private Date purchaseDate;
	private int quantity;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;

	private String lastModifiedUser;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getStock_Number() {
		return stock_Number;
	}

	public void setStock_Number(int stock_Number) {
		this.stock_Number = stock_Number;
	}

	public String getStock_Name() {
		return stock_Name;
	}

	public void setStock_Name(String stock_Name) {
		this.stock_Name = stock_Name;
	}

	public float getPurchasingPrice() {
		return purchasingPrice;
	}

	public void setPurchasingPrice(float purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getDateStock() {
		return dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	public Date getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(Date lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stock_Number=" + stock_Number + ", stock_Name=" + stock_Name
				+ ", purchasingPrice=" + purchasingPrice + ", purchaseDate=" + purchaseDate + ", quantity=" + quantity
				+ ", createdDateTime=" + createdDateTime + ", createdUser=" + createdUser + ", dateStock=" + dateStock
				+ ", lastModifiedDateTime=" + lastModifiedDateTime + ", lastModifiedUser=" + lastModifiedUser + "]";
	}

}
