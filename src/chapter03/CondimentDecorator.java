package chapter03;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage; // 각 데코레이터가 감쌀 객체를 저장, 슈퍼클래스 타입 사용
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
