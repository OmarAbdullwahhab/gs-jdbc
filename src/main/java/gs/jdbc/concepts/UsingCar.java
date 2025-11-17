package gs.jdbc.concepts;

public class UsingCar {


    public void accCar(ICar car){
        car.accelerate();
    }

    public static void main(String[] args){
        UsingCar u = new UsingCar();
        u.accCar(new Ford());
        u.accCar(new Hyundai());
        u.accCar(new Toyota());
    }
}
