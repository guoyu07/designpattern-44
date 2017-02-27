package cn.lweizhou.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();

		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.performFly();
//		mallardDuck.performQuck();
		mallardDuck.display();

	}

}
