package chapter01;

public class Mallard extends Duck{


    public Mallard() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("말라드 오리가 보이는 중");
    }
}
