package cn.lweizhou.template;

public class Coffee  extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("用沸水冲泡咖啡粉...");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶...");
    }

    @Override
    boolean customerWantsCondiments() { //不想加糖和牛奶
        return false;
    }
    
}
