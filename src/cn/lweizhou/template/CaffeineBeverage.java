package cn.lweizhou.template;

public abstract class CaffeineBeverage {

    // 模板方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private final void boilWater() {
        System.out.println("把水煮沸...");
    }

    private final void pourInCup() {
        System.out.println("把飲料倒入杯子...");
    }


    boolean customerWantsCondiments() { //钩子方法，子类可以实现该方法，顾客是否需要加饮料
        return true;
    }



}
