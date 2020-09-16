package com.example.stock.trade;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Trade {

	private String id;
	private String type;
	private int userId;
	private String symbol;
	private int shares;
	private int price;
	
	private Trade() {
		
	}
	
	public Trade(String id, String type, int userId, String symbol, int shares, int price) {
		super();
		this.id = id;
		this.type = type;
		this.userId = userId;
		this.symbol = symbol;
		this.shares = shares;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
