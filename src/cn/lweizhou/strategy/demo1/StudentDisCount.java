package cn.lweizhou.strategy.demo1;

public class StudentDisCount implements DisCount {

	@Override
	public double calculate(double price) {
		
		return price * 0.8;
	}

}
