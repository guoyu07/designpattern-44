package cn.lweizhou.strategy.demo1;

public class ChildrenDiscount implements DisCount {

	@Override
	public double calculate(double price) {
		
		return price - 10;
	}

}
