package chapter01;

public class MainDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new Mallard();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
