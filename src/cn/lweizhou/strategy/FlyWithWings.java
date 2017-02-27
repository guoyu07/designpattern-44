package cn.lweizhou.strategy;

public class FlyWithWings implements FlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("我有翅膀我可以飞");
	}

}
