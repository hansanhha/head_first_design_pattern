package chapter03;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .25;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", 두유;";
    }
}
