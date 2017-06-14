package cn.lweizhou.template;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("用沸水浸泡茶叶...");
    }

    @Override
    void addCondiments() {
        System.out.println("加柠檬...");
    }

}
