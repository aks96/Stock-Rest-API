package com.example.stock.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradesController {
	
	@Autowired
	private TradeService tradeService;
	
	@RequestMapping("/trades")
	public List<Trade> getAllTrades() {
		return tradeService.getAllTrades();
	}

	@RequestMapping("/trades/{id}")
	public Trade getTrade(@PathVariable String id) {
		return tradeService.getTrade(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/trades")
	public void addTrade(@RequestBody Trade trade) {
		tradeService.addTrade(trade);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	public void updateTrade(@RequestBody Trade trade, @PathVariable String id) {
		tradeService.updateTrade(id,trade);
	}
//	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTrade(@PathVariable String id) {
		tradeService.deleteTrade(id);
	}
}
