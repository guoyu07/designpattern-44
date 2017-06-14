package cn.lweizhou.template;

public class Main {

    public static void main(String[] args) {
        
        
        CaffeineBeverage t = new Tea();
        t.prepareRecipe();
        System.out.println("------------------------");
        Coffee c  = new Coffee();
        c.prepareRecipe();
    }
    
}
