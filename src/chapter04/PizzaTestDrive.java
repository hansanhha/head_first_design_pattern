package chapter04;

public class PizzaTestDrive {


    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza cheese = nyStore.orderPizza("cheese");
        System.out.println(cheese.getName());

    }
}
