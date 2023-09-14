package chapter03;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .5;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
