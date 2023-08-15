package StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car=new Car("mazda 3","skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car1=new Car("mazda 6","skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
