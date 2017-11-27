package os.jr.hooks;

import os.jr.hooks.model.GameClass;
import os.jr.hooks.model.GameField;

public class GrandExchange extends GameClass{

	public GrandExchange() {
		super("f");
		String grandExchange = "f";
		this.fields.put("TradingPost_Status", new GameField("d", grandExchange));
		this.fields.put("TradingPost_ItemID", new GameField("x", grandExchange));
		this.fields.put("TradingPost_Price", new GameField("k", grandExchange));
		this.fields.put("TradingPost_Quantity", new GameField("z", grandExchange));
		this.fields.put("TradingPost_Transferred", new GameField("v", grandExchange));
		this.fields.put("TradingPost_Spent", new GameField("m", grandExchange));
		//this.fields.put("TradingPost_QueryIDs", new GameField("b", grandExchange)); N/A
	}

}