package cn.lweizhou.strategy;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public void performQuck() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("所有的鸭子都会游泳！");
	}

	public abstract void display();

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
