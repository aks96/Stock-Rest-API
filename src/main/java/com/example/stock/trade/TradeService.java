package com.example.stock.trade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TradeService {
	
	private List<Trade> trades = new ArrayList<>(Arrays.asList(
			new Trade("1", "buy", 1, "gen", 20, 200),
			new Trade("2", "sell", 2, "gen", 40, 700)
					
			));
	
	public List<Trade> getAllTrades(){
		return trades;
	}
	
	public Trade getTrade(String id) {
		return trades.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTrade(Trade trade) {
		trades.add(trade);
	}

	public void updateTrade(String id,Trade trade) {
		for(int i=0;i<trades.size();i++) {
			Trade t = trades.get(i);
			if(t.getId().equals(id)) {
				trades.set(i, trade);
			}
		}
	}

	public void deleteTrade(String id) {
		trades.removeIf(t -> t.getId().equals(id));
	}
	
	
}
